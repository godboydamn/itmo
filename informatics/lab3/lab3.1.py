# 405
import re

def count_smiles(text):
	pattern = r'=-/'
	smiles = re.findall(pattern, test)
	return len(smiles)
	
test = input()

result = count_smiles(test)

print("Количество смайлов в строке = ", result)
