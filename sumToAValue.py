arr = [1,9,3,7,5,6,4,8,2]
value = 8

comp = []
for i in arr:
    if i in comp:
        print(i, value - i)
    else:
        comp.append(value - i)
