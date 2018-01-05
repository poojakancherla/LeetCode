def reverse(integer):
    if integer[0] == '-':
        integer = integer[1:]
        print(int('-' + integer[::-1]))
    else:
        print(int(integer[::-1]))

reverse(input())
