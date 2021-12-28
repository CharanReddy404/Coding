#fibonacci or not
num = int(input("Input: "))
a = 0
b = 1
c = 0

while c<num:
    c = a+b
    a = b
    b = c

if b == num:
    print("Output: Yes")
else:
    print("Output: No ")