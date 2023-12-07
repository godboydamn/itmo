import re

def find_words_with_sequence(text):
    pattern = r'[Кк][^КкРрАа][Рр][^КкРрАа][Аа]'
    matches = re.findall(pattern, text)
    return matches

text = input("Введите текст: ")

result = find_words_with_sequence(text)
print(result)
