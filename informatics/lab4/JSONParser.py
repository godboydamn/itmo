# Generated from JSON.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16")
        buf.write("8\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2")
        buf.write("\17\n\2\3\3\3\3\3\3\3\3\7\3\25\n\3\f\3\16\3\30\13\3\5")
        buf.write("\3\32\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5")
        buf.write("\3\5\3\5\5\5)\n\5\3\6\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62")
        buf.write("\13\6\5\6\64\n\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2=\2")
        buf.write("\16\3\2\2\2\4\20\3\2\2\2\6\35\3\2\2\2\b(\3\2\2\2\n*\3")
        buf.write("\2\2\2\f\17\5\4\3\2\r\17\5\n\6\2\16\f\3\2\2\2\16\r\3\2")
        buf.write("\2\2\17\3\3\2\2\2\20\31\7\3\2\2\21\26\5\6\4\2\22\23\7")
        buf.write("\4\2\2\23\25\5\6\4\2\24\22\3\2\2\2\25\30\3\2\2\2\26\24")
        buf.write("\3\2\2\2\26\27\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\31")
        buf.write("\21\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\5\2\2")
        buf.write("\34\5\3\2\2\2\35\36\7\f\2\2\36\37\7\6\2\2\37 \5\b\5\2")
        buf.write(" \7\3\2\2\2!)\7\f\2\2\")\7\r\2\2#)\5\4\3\2$)\5\n\6\2%")
        buf.write(")\7\7\2\2&)\7\b\2\2\')\7\t\2\2(!\3\2\2\2(\"\3\2\2\2(#")
        buf.write("\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\t\3")
        buf.write("\2\2\2*\63\7\n\2\2+\60\5\b\5\2,-\7\4\2\2-/\5\b\5\2.,\3")
        buf.write("\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2")
        buf.write("\2\2\62\60\3\2\2\2\63+\3\2\2\2\63\64\3\2\2\2\64\65\3\2")
        buf.write("\2\2\65\66\7\13\2\2\66\13\3\2\2\2\b\16\26\31(\60\63")
        return buf.getvalue()


class JSONParser ( Parser ):

    grammarFileName = "JSON.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'{'", "','", "'}'", "':'", "'true'", 
                     "'false'", "'null'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "STRING", "NUMBER", "WS" ]

    RULE_json = 0
    RULE_jsonObject = 1
    RULE_pair = 2
    RULE_value = 3
    RULE_jsonArray = 4

    ruleNames =  [ "json", "jsonObject", "pair", "value", "jsonArray" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    STRING=10
    NUMBER=11
    WS=12

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class JsonContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def jsonObject(self):
            return self.getTypedRuleContext(JSONParser.JsonObjectContext,0)


        def jsonArray(self):
            return self.getTypedRuleContext(JSONParser.JsonArrayContext,0)


        def getRuleIndex(self):
            return JSONParser.RULE_json

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterJson" ):
                listener.enterJson(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitJson" ):
                listener.exitJson(self)




    def json(self):

        localctx = JSONParser.JsonContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_json)
        try:
            self.state = 12
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JSONParser.T__0]:
                self.enterOuterAlt(localctx, 1)
                self.state = 10
                self.jsonObject()
                pass
            elif token in [JSONParser.T__7]:
                self.enterOuterAlt(localctx, 2)
                self.state = 11
                self.jsonArray()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class JsonObjectContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def pair(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JSONParser.PairContext)
            else:
                return self.getTypedRuleContext(JSONParser.PairContext,i)


        def getRuleIndex(self):
            return JSONParser.RULE_jsonObject

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterJsonObject" ):
                listener.enterJsonObject(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitJsonObject" ):
                listener.exitJsonObject(self)




    def jsonObject(self):

        localctx = JSONParser.JsonObjectContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_jsonObject)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.match(JSONParser.T__0)
            self.state = 23
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==JSONParser.STRING:
                self.state = 15
                self.pair()
                self.state = 20
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==JSONParser.T__1:
                    self.state = 16
                    self.match(JSONParser.T__1)
                    self.state = 17
                    self.pair()
                    self.state = 22
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 25
            self.match(JSONParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class PairContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(JSONParser.STRING, 0)

        def value(self):
            return self.getTypedRuleContext(JSONParser.ValueContext,0)


        def getRuleIndex(self):
            return JSONParser.RULE_pair

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPair" ):
                listener.enterPair(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPair" ):
                listener.exitPair(self)




    def pair(self):

        localctx = JSONParser.PairContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_pair)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(JSONParser.STRING)
            self.state = 28
            self.match(JSONParser.T__3)
            self.state = 29
            self.value()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ValueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(JSONParser.STRING, 0)

        def NUMBER(self):
            return self.getToken(JSONParser.NUMBER, 0)

        def jsonObject(self):
            return self.getTypedRuleContext(JSONParser.JsonObjectContext,0)


        def jsonArray(self):
            return self.getTypedRuleContext(JSONParser.JsonArrayContext,0)


        def getRuleIndex(self):
            return JSONParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)




    def value(self):

        localctx = JSONParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_value)
        try:
            self.state = 38
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [JSONParser.STRING]:
                self.enterOuterAlt(localctx, 1)
                self.state = 31
                self.match(JSONParser.STRING)
                pass
            elif token in [JSONParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 32
                self.match(JSONParser.NUMBER)
                pass
            elif token in [JSONParser.T__0]:
                self.enterOuterAlt(localctx, 3)
                self.state = 33
                self.jsonObject()
                pass
            elif token in [JSONParser.T__7]:
                self.enterOuterAlt(localctx, 4)
                self.state = 34
                self.jsonArray()
                pass
            elif token in [JSONParser.T__4]:
                self.enterOuterAlt(localctx, 5)
                self.state = 35
                self.match(JSONParser.T__4)
                pass
            elif token in [JSONParser.T__5]:
                self.enterOuterAlt(localctx, 6)
                self.state = 36
                self.match(JSONParser.T__5)
                pass
            elif token in [JSONParser.T__6]:
                self.enterOuterAlt(localctx, 7)
                self.state = 37
                self.match(JSONParser.T__6)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class JsonArrayContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(JSONParser.ValueContext)
            else:
                return self.getTypedRuleContext(JSONParser.ValueContext,i)


        def getRuleIndex(self):
            return JSONParser.RULE_jsonArray

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterJsonArray" ):
                listener.enterJsonArray(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitJsonArray" ):
                listener.exitJsonArray(self)




    def jsonArray(self):

        localctx = JSONParser.JsonArrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_jsonArray)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(JSONParser.T__7)
            self.state = 49
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << JSONParser.T__0) | (1 << JSONParser.T__4) | (1 << JSONParser.T__5) | (1 << JSONParser.T__6) | (1 << JSONParser.T__7) | (1 << JSONParser.STRING) | (1 << JSONParser.NUMBER))) != 0):
                self.state = 41
                self.value()
                self.state = 46
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==JSONParser.T__1:
                    self.state = 42
                    self.match(JSONParser.T__1)
                    self.state = 43
                    self.value()
                    self.state = 48
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 51
            self.match(JSONParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





