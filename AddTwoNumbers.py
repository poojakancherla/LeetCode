s = list("pwwkew")

l = ""

sub = []

for i in range(len(s)):
    if s[i] not in list(l):
        l += s[i]
        if i == len(s) - 1:
            sub.append((len(l),l))
    else:
        sub.append((len(l),l))
        l = s[i]
        if i == len(s) - 1:
            sub.append((len(l),l))


print(sub)
print(max(sub)[1])
