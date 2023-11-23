from antlr4 import InputStream, CommonTokenStream
from JSONLexer import JSONLexer
from JSONParser import JSONParser
import json

# Функция для преобразования JSON в XML
def json_to_xml(json_data):
    input_stream = InputStream(json_data)
    lexer = JSONLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = JSONParser(stream)
    tree = parser.json()
    
    def traverse_tree(node):
        result = ""
        if node.getChildCount() == 0:
            result = node.getText()
        else:
            result = "<" + node.getText() + ">"
            for i in range(node.getChildCount()):
                result += traverse_tree(node.getChild(i))
            result += "</" + node.getText() + ">"
        return result

    xml_result = traverse_tree(tree)
    return xml_result

with open("lab4.json", "r") as json_file:
    json_data = json_file.read()

xml_result = json_to_xml(json_data)

with open("lab4grammar.xml", "w") as xml_file:
    # Разбиваем результат на отдельные строки и записываем их в файл
    lines = xml_result.splitlines()
    for line in lines:
        xml_file.write(line + '\n')

