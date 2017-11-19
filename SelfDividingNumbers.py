left = int(input())
right = int(input())
l = []

for i in range(left, right+1):
    count = 0
    num = list(str(i))
    num = [int(x) for x in num]
    for j in num:
        if j==0:
            break
        else:
            if i%j == 0:
                count+=1
    if count == len(num):
        l.append(i)

print(l)        
