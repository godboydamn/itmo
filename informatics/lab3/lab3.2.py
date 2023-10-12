#4
import re

pattern = r'\b(?:[01]\d|2[0-3]):[0-5]\d(?::[0-5]\d)?\b'

text = input("Введите текст: ")

# Используем функцию findall для нахождения всех времен в тексте
times = re.findall(pattern, text)

for time in times:
    # Разбиваем время на часы, минуты и (опционально) секунды
    components = list(map(int, time.split(':')))
    
    # Проверяем, что часы не превышают 23
    if components[0] <= 23:
        text = text.replace(time, '(TBD)')

print(text)


