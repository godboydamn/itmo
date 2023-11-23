import json

def json_to_xml(json_data):
    xml_string = []
    xml_string.append('<?xml version="1.0" encoding="utf-8"?>')
    xml_string.append("<root>")
    xml_string.append("	<Wednesday>")
    for entry in json_data["Wednesday"]:
        xml_string.append("		<item>")
        for key, value in entry.items():
            xml_string.append(f"			<{key}>{value}</{key}>")
        xml_string.append("		</item>")
    xml_string.append("	</Wednesday>")
    xml_string.append("</root>")
    return "\n".join(xml_string)

with open("lab4.json", "r") as json_file:
    json_data = json.load(json_file)

xml_result = json_to_xml(json_data)

with open("lab4.xml", "w") as xml_file:
    xml_file.write(xml_result)

