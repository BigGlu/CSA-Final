with open('Resources/example.txt', 'r') as file:
    lines = [line.strip() for line in file][:10]

for line in lines:
    print(line)