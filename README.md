# Intérprete para lenguaje de programación Soprano
Para este proyecto se desarrolló un nuevo lenguaje de programación con una sintaxis basada en como se escribe la música. También se desarrolló el intérprete que traducirá el programa escrito en Soprano a las partituras correspondientes en un archivo pdf, un archivo wav, midi y mp3 de la melodía.

## Soprano
Soprano es un lenguaje de programación musical orientado a la composición algorítmica. Es decir, que compone música mediante algoritmos, usando estructuras definidas y una sintaxis específica.
Soprano permite escribir programas sencillos de forma similar a los lenguajes de programación habituales como C, Python o Java. 
Su gramática está escrita con ANTLR y python.


**Iniciar Soprano**

En linux (Desde el directorio raíz del repositorio):

```shell
./run_flask.sh
```
> run_flask.sh navega al directorio de la app de flask, activa el entorno virtual de python, instala las librerías necesarias y ejecuta un servidor de Flask en modo depuración en la url http://127.0.0.1:5000.

## Intérprete
Su función principal es tomar composiciones algorítmicas escritas en el lenguaje Soprano y convertirlas en partituras digitales acompañadas de archivos de sonido que dan vida a la melodía concebida por el compositor. 
![Diagrama del intérprete](diagrama.png)


## Manejo de errores
El intérprete detecta la mayoría de errores sintácticos; también detecta errores comunes en el código fuente, como:
1. Número de parámetros incorrectos en los procedimientos
2. Variables o funciones sin declarar
  

**Compilar gramática**
```shell
antlr4 -Dlanguage=Python3 -no-listener -visitor soprano.g
```
> Este comando no es necesario para correr el programa pero fue el que generó la mayoría de los archivos de la carpeta SopranoGrammar, como el analizador léxico (sopranoLexer.py), el analizador sintáctico (sopranoParser.py) y otros archivos correspondientes a la gramática de Soprano como el archivo de tokens (soprano.tokens).

## Programas externos
* LilyPond: Para generar las partituras. MIDI y PDF. 
* timidity++: Para generar WAV a partir de MIDI. 
* ffmpeg: Para generar MP3 a partir de WAV.

## Agradecimientos a instructores
- Zaira Zuviría
- Lucas Bazilio
