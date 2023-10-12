#4
import re

def replace_time_with_tbd(text):
    time_pattern = r'\b\d{2}:\d{2}(:\d{2})?\b'
    
    result = re.sub(time_pattern, "(TBD)", text)
    
    return result

post_content = "Занятие будет проходить с 10:30 до 12:00:30. Приходите вовремя!"
updated_post_content = replace_time_with_tbd(post_content)

print(updated_post_content)


