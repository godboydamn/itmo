import json
import re

def json_to_xml(json_data):
    def parse_element(key, value):
        if isinstance(value, dict):
            return f"<{key}>{parse_dict(value)}</{key}>"
        elif isinstance(value, list):
            return f"<{key}>{parse_list(value)}</{key}>"
        else:
            return f"<{key}>{value}</{key}>"

    def parse_dict(data):
        return ''.join([parse_element(key, value) for key, value in data.items()])

    def parse_list(data):
    	return ''.join([parse_element('item', item) for item in data])

    xml_data = parse_dict(json_data)
    return f"<root>{xml_data}</root>"

with open('lab4.json') as json_file:
    json_data = json.load(json_file)

xml_data = json_to_xml(json_data)

xml_data = re.sub(r'><', '>\n<', xml_data)

with open('lab4re.xml', 'w') as xml_file:
    xml_file.write(xml_data)

