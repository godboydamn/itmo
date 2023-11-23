import json
import xml.etree.ElementTree as ET
from xml.dom import minidom

def convert_json_to_xml(input_file, output_file):
    with open(input_file, 'r', encoding='utf-8') as json_file:
        data = json.load(json_file)

        root = ET.Element("root")

        def json_to_xml(json_obj, parent):
            if isinstance(json_obj, dict):
                for key in json_obj:
                    element = ET.Element(key)
                    parent.append(element)
                    json_to_xml(json_obj[key], element)
            elif isinstance(json_obj, list):
                for item in json_obj:
                    element = ET.Element('item')
                    parent.append(element)
                    json_to_xml(item, element)
            else:
                parent.text = str(json_obj)

        json_to_xml(data, root)

        rough_string = ET.tostring(root, 'utf-8')
        reparsed = minidom.parseString(rough_string)
        pretty_xml = reparsed.toprettyxml(indent="\t", encoding='utf-8')

        with open(output_file, 'wb') as xml_file:
            xml_file.write(pretty_xml)

convert_json_to_xml('lab4.json', 'withlibs.xml')
