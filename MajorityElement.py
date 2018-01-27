import math
l = [8, 9, 8, 9, 9]
d = {}

for i in range(len(l)):
    if l[i] in d.keys():
        d[l[i]] += 1
    else:
            d[l[i]] = 1
for k,v in d.items():
    if v > math.floor(len(l)/2):
        print(k)
