class ValidParanthesis:
    def isValid(result,s):
        stack, lookup = [], {"(": ")", "{": "}", "[": "]"}
        for stringElement in s:
            if stringElement in lookup:
                stack.append(stringElement)
            elif len(stack) == 0 or lookup[stack.pop()] != stringElement:
                return False
        return len(stack) == 0
print(ValidParanthesis().isValid("(){[]}"))
