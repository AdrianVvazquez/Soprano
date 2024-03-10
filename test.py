from antlr4 import *
from sopranoLexer import sopranoLexer
from sopranoParser import sopranoParser
from visitor import Visitor
import sys

input_stream = FileStream(sys.argv[1])

lexer = sopranoLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = sopranoParser(token_stream)
tree = parser.root()

visitor = Visitor()
visitor.visit(tree)
