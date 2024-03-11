# 24/03/2024
# Autor: Adrian V.
import os
from pathlib import Path
from flask import ( 
    Blueprint, flash, g, redirect, render_template, request, url_for
    ,send_from_directory, current_app
)
from werkzeug.utils import secure_filename
from werkzeug.exceptions import abort
from SopranoGrammar import soprano
from .responses.reponse_json import response_json
import zipfile

bp = Blueprint('sopranoIDE', __name__)

@bp.route('/', methods=['get','post'])
def index():
    if request.method == 'POST':
        file_name = request.form['filename']
        source_code = request.form['codigo']
        entry_Proc = request.form['first_proc']
        
        if not file_name or not source_code or not entry_Proc:
            flash('Todos los campos son requeridos.', 'error')
            return render_template('sopranoIDE/index.html')
        if len(source_code) > 3070:
            flash('Tu código sobrepasa el límite de carácteres.', 'error')
            return render_template('sopranoIDE/index.html')
        # secure filename
        filename = secure_filename(file_name)
        # write source file 
        file_path = os.path.join(os.environ.get('UPLOADS_DIR'), f'{filename}.spr')
        try:
            with open(file_path, 'w') as f:
                f.write(source_code)

            flash("Starting running interpreter.", 'debug')
            soprano.run_soprano(file_path, entry_Proc)
            flash("Descargando archivos...", 'info')

            # return render_template('sopranoIDE/index.html', [])
            return redirect(url_for('sopranoIDE.download_folder',filename=filename))
            
        except FileNotFoundError as e:
            flash('No se pudo crear el archivo.', 'error')
        except FileExistsError as e:
            flash("Ya existe un archivo con este nombre.", 'error')
        except Exception as e:
            if e.args:
                error_code = e.args[0]
                flash(f'[ERROR: {error_code}] {e}', 'error')
            else:
                flash(e, 'error')
            return render_template('sopranoIDE/index.html')
        
    return render_template('sopranoIDE/index.html')

@bp.route('/upload', methods=['POST'])
def upload_file():
    if request.method == 'POST':
        filename = secure_filename(file.filename)
        if not allowed_file(filename):
            return response_json("Bad file extension", 400)
            
        try:
            file = request.files['file']
            file.save(Path(current_app.config["UPLOAD_FOLDER"]) + filename)
            return response_json("success")
        except FileNotFoundError:
            return response_json("Folder not found", 404)
        except Exception as e:
            return response_json(str(e), 400)
        

@bp.route('/download/<string:filename>', methods=['GET'])
def download_folder(filename):
    filename = secure_filename(filename)
    nombre_zip = f'{filename}.zip'
    musica_dir_path = Path(os.path.join(current_app.config["UPLOAD_FOLDER"], filename))
    try:
        # Crear el archivo zip
        with zipfile.ZipFile(f'{musica_dir_path}/{nombre_zip}', 'w', zipfile.ZIP_DEFLATED) as zip_obj:
            for file in musica_dir_path.iterdir():
                if file.suffix != ".zip":
                    print(file)
                    zip_obj.write(file, arcname=file.name)
        # Enviar el archivo zip para descargar
        return send_from_directory(musica_dir_path, path=nombre_zip, as_attachment=True)
    except Exception as e:
        return response_json(str(e), 404)


def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.', 1)[1].lower() == "spr"

