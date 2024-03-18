import sys
from antlr4 import *
from sopranoLexer import sopranoLexer
from sopranoParser import sopranoParser
from visitor import Visitor, bcolors, SopranoException
import sys

input_stream = FileStream(sys.argv[1], encoding='utf-8')

lexer = sopranoLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = sopranoParser(token_stream)
tree = parser.root()

if sys.argv[1].rsplit(".", 1)[1] != "sopr":
    print(bcolors.FAIL+"[Error] Bad extension."+bcolors.RESET)
    sys.exit(0)

if len(sys.argv) > 2:
    visitor = Visitor(file_name=sys.argv[1], entryProc=sys.argv[2])
else:
    visitor = Visitor(file_name=sys.argv[1])

visitor.visit(tree)
