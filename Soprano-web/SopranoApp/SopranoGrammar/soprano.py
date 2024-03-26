# 24/03/2024
# Autor: Adrian V.
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .sopranoLexer import sopranoLexer
    from .sopranoParser import sopranoParser
    from .visitor import Visitor, bcolors, SopranoException
else:
    from sopranoParser import sopranoParser
    from sopranoParser import sopranoParser
    from visitor import Visitor, bcolors, SopranoException

def run_soprano(filePath, entryProc="Main"):
    # Check file extention
    fileName = filePath.rsplit("/", 1)[1]
    if fileName.rsplit(".", 1)[1] != "spr":
        raise SopranoException(bcolors.FAIL+"[Error] Bad file extension."+bcolors.RESET)
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
    except Exception as e:
        raise SopranoException(bcolors.WARNING +str(e)+ bcolors.RESET)

