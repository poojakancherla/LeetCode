s = "leetcode"
d = {}

for i in range(len(s)):
    if s[i] in d:
        del d[s[i]]
    else:
        d[s[i]] = i

if len(d) > 0:
    for k,v in d.items():
        print(v)
        break
else:
    print('-1')
