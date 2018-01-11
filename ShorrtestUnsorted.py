nums = list(int(x) for x in input().split())
l = []
snums = sorted(nums)
s, e = -1, -1

for i in range(len(nums)):
    if not (nums[i] == snums[i]):
        if s == -1:
            s = i
        if e <= len(nums):
            e = i
if s == -1 and e == -1:
    print(0)
else:
    print(e - s + 1)
