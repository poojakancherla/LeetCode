nums = [2, 7, 11, 15]
target = 9
l = []
d = {}
for i in nums:
    if (target-i) in d.keys():
        if target-i < i:
            print(target-i, i)
        else:
            print(i, target-i)
    else:
        d[i] = 1
