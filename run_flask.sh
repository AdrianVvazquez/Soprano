#!/bin/bash
# Este script verifica las dependencias y ejecuta el comando Flask en la ubicación especificada

# Navega al directorio donde se encuentra tu aplicación Flask
cd Soprano-web

# Activa el entorno virtual
source .venv/bin/activate

# Verifica si las dependencias están instaladas
pip freeze > installed.txt
if ! diff -q requirements.txt installed.txt > /dev/null; then
    echo "Instalando dependencias faltantes..."
    pip install -r requirements.txt
else
    echo "Todas las dependencias están instaladas."
fi
rm installed.txt

# Navega al directorio SopranoApp
cd SopranoApp

# Ejecuta el comando Flask con la opción de depuración
flask --app SopranoIDE run --debug
