# 24/03/2024
# Autor: Adrian V.
import os
from flask import ( 
    Blueprint, flash, g, redirect, render_template, request, url_for
    ,send_from_directory, current_app
)
from werkzeug.utils import secure_filename
from werkzeug.exceptions import abort
from SopranoGrammar import soprano
from SopranoIDE.auth import login_required
from SopranoIDE.db import get_db

bp = Blueprint('sopranoIDE', __name__)

@bp.route('/', methods=['get','post'])
def index():
    if request.method == 'POST':
        file_name = request.form['filename']
        source_code = request.form['codigo']
        entry_Proc = request.form['first_proc']
        
        if not file_name or not source_code or not entry_Proc:
            flash('Todos los campos son requeridos.')
            return render_template('sopranoIDE/index.html')
        
        # write source file 
        # file_path = os.path.join(os.path.dirname(__file__), f'{file_name}.spr')
        file_path = os.path.join("/",current_app.config["UPLOAD_FOLDER"], f'{file_name}.spr')
        try:
            with open(file_path, 'w') as f:
                f.write(source_code)
            # run Soprano interpreter
            soprano.run_soprano(file_path, entry_Proc)
            return redirect('downloads',filename=f'{file_name}/{file_name}.mp3')
        except FileNotFoundError as e:
            flash('No se pudo crear el archivo.')
        except Exception as e:
            if "File exists" in str(e):
                flash("Un archivo con este nombre ya existe.")
        
    return render_template('sopranoIDE/index.html')

@bp.route('/upload', methods=['POST'])
def upload_file():
    if request.method == 'POST':
        # check if the post request has the file part
        if 'file' not in request.files:
            flash('No file part')
            return redirect(url_for('index'))
        file = request.files['file']
        # If the user does not select a file, the browser submits an
        # empty file without a filename.
        if file.filename == '':
            flash('Selecciona un archivo.')
            return redirect(url_for('index'))
        if file and allowed_file(file.filename):
            filename = secure_filename(file.filename)
            file.save(os.path.join('/',current_app.config['UPLOAD_FOLDER'], filename))
            flash("Archivo cargado existósamente.")
            return redirect(url_for('index'))

@bp.route('/downloads/<filename>')
def download_file(filename):
    return send_from_directory('/'+current_app.config["UPLOAD_FOLDER"], filename)

def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.', 1)[1].lower() == "spr"

