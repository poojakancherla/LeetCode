class Stack:
    def __init__(self):
        self.l = []


    def push(self, x):
        global l
        self.l.append(x)


    def pop(self):
        global l
        if len(self.l) > 0:
            s = self.l[-1]
            del self.l[-1]
            print(s)
        else:
            print("no elements in stack")

    def top(self):
        global l
        if len(self.l) > 0:
            print( self.l[-1])
        else:
            print("no elements in stack")

    def minStack(self):
        global l
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
#
# class Stack:
#   def __init__(self):
#     self.l = []
#
#   def isEmpty(self):
#     return len(self.l) == 0
#
#   def push(self,p):
#     self.l.append(p)
#
#   def pop(self):
#     return self.l.pop()
#
# s = Stack()
# print(s.isEmpty())
