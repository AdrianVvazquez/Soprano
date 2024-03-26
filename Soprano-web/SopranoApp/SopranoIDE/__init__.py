# 24/03/2024
# Autor: Adrian V.
import os
from flask import Flask


def create_app(test_config=None):
    # Setup
    app = Flask(__name__, instance_relative_config=True)
    app.config.from_mapping(
        SECRET_KEY=os.environ.get("SECRET_KEY"),
        DATABASE=os.path.join(app.instance_path, 'SopranoApp.sqlite'),
    )
    app.config['BASE_DIR'] = os.environ.get("BASE_DIR")
    app.config['UPLOAD_FOLDER'] = os.environ.get("UPLOADS_DIR")
    if test_config is None:
        # load the instance config, if it exists, when not testing
        app.config.from_pyfile('config.py', silent=True)
    else:
        # load the test config if passed in
        app.config.from_mapping(test_config)

    # ensure the instance folder exists
    try:
        os.makedirs(app.instance_path)
    except OSError:
        pass

    from . import db
    db.init_app(app)

    from . import auth
    app.register_blueprint(auth.bp)
    
    from . import sopranoIDE
    app.register_blueprint(sopranoIDE.bp)
    app.add_url_rule('/', endpoint='index')
    
    return app
