# 24/03/2024
# Autor: Adrian V.
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .sopranoLexer import sopranoLexer
    from .sopranoParser import sopranoParser
    from .visitor import Visitor, SopranoException
else:
    from sopranoParser import sopranoParser
    from sopranoParser import sopranoParser
    from visitor import Visitor, SopranoException

class SopranoWEBException(Exception):
    def __init__(self, message, error_code=404):
        self.args = [error_code]
        self.message = message
        
    def __str__(self) -> str:
        return self.message

def run_soprano(filePath, entryProc="Main"):
    # Check file extention
    fileName = filePath.rsplit("/", 1)[1]
    if fileName.rsplit(".", 1)[1] != "spr":
        raise SopranoException("Bad file extension.")
    try:
        # File Stream
        input_stream = FileStream(filePath, encoding='utf-8')
        # Lexer
        lexer = sopranoLexer(input_stream)
        # Tomen Stream
        token_stream = CommonTokenStream(lexer)
        # Parser
        parser = sopranoParser(token_stream)
        tree = parser.root()
        # Visitor
        visitor = Visitor(filePath.rsplit("/", 1)[0], fileName.rsplit(".",1)[0], entryProc=entryProc)
        # Send Tree Parser to Visitor
        visitor.visit(tree)
    except FileExistsError:
        raise SopranoWEBException("Ya existe un archivo con este nombre en tu espacio de trabajo.")
    except Exception as e:
        error_code = 404
        if e.args:
            error_code = e.args[0]
        raise SopranoWEBException(str(e.message), error_code=error_code)


