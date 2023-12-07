import re


def replace_time_with_tbd(text):
    time_pattern = r'\b(?:[01]\d|2[0-3]):(?:[0-5]\d)(?::(?:[0-5]\d))?\b'

    result = re.sub(time_pattern, "(TBD)", text)

    return result


post_content = input("Введите текст с временем: ")
updated_post_content = replace_time_with_tbd(post_content)

print(updated_post_content)
