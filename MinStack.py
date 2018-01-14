class Stack:
    def __init__(self):
        self.l = []


    def push(self, x):
        self.l.append(x)


    def pop(self):
        if len(self.l) > 0:
            s = self.l[-1]
            del self.l[-1]
            print(s)
        else:
            print("no elements in stack")

    def top(self):
        if len(self.l) > 0:
            print( self.l[-1])
        else:
            print("no elements in stack")

    def minStack(self):
        if len(self.l) > 0:
            print(min(self.l))
        else:
            print("no elements in stack")


s = Stack()
s.pop()
s.push(1)
s.push(-9)
s.push(8)
s.push(5)
s.push(3)
s.push(7)
s.push(2)


s.minStack()
s.top()
