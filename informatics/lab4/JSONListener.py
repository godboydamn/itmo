# Generated from JSON.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JSONParser import JSONParser
else:
    from JSONParser import JSONParser

# This class defines a complete listener for a parse tree produced by JSONParser.
class JSONListener(ParseTreeListener):

    # Enter a parse tree produced by JSONParser#json.
    def enterJson(self, ctx:JSONParser.JsonContext):
        pass

    # Exit a parse tree produced by JSONParser#json.
    def exitJson(self, ctx:JSONParser.JsonContext):
        pass


    # Enter a parse tree produced by JSONParser#jsonObject.
    def enterJsonObject(self, ctx:JSONParser.JsonObjectContext):
        pass

    # Exit a parse tree produced by JSONParser#jsonObject.
    def exitJsonObject(self, ctx:JSONParser.JsonObjectContext):
        pass


    # Enter a parse tree produced by JSONParser#pair.
    def enterPair(self, ctx:JSONParser.PairContext):
        pass

    # Exit a parse tree produced by JSONParser#pair.
    def exitPair(self, ctx:JSONParser.PairContext):
        pass


    # Enter a parse tree produced by JSONParser#value.
    def enterValue(self, ctx:JSONParser.ValueContext):
        pass

    # Exit a parse tree produced by JSONParser#value.
    def exitValue(self, ctx:JSONParser.ValueContext):
        pass


    # Enter a parse tree produced by JSONParser#jsonArray.
    def enterJsonArray(self, ctx:JSONParser.JsonArrayContext):
        pass

    # Exit a parse tree produced by JSONParser#jsonArray.
    def exitJsonArray(self, ctx:JSONParser.JsonArrayContext):
        pass


