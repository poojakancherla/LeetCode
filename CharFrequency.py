string = list(input())


d = {}
for i in range(len(string)):
    if string[i] != ' ':
        if string[i] in d.keys():
            d[string[i]] += 1
        else:
            d[string[i]] = 1
for key, value in d.items():
    print(key, value)
