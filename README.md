# Interprete para lenguaje de programación Soprano

## Soprano
Soprano es un lenguaje de programación musical orientado a la composición algorítmica. Es decir, que compone música mediante algoritmos, usando estructuras definidas y una sintaxis específica.
Soprano permite escribir programas sencillos de forma similar a los lenguajes de programación habituales como C, Python o Java. 
**Compilar gramática: **
\```python
antlr4 -Dlanguage=Python3 -no-listener -visitor soprano.g
\```
Este comando creará el analizador léxico (SopranoLexer.py) y el analizador sintáctico (SopranoParser.py) correspondientes.

## Intérprete
Su función principal radica en tomar composiciones algorítmicas escritas en el lenguaje Soprano y convertirlas en partituras digitales acompañadas de archivos de sonido que dan vida a la melodía concebida por el compositor. 

**Ejecutar prueba: **
\```python
python3 test.py input.txt
\```

![Diagrama del intérprete](image.png)