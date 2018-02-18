l = [2, 8, 9, 3, 4]
total = 0
for i in range(len(l) - 1):
    if l[i+1] > l[i]:
        total += l[i+1] - l[i]
print(total)
