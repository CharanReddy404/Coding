#Fibonacci Series

num = int(input("Enter The Number: "))

def fibonacci(num):
    a = 0
    b = 1
    if num < 0:
        print("Incorrect Number!")
    elif num == 0:
        return a
    elif num == 1:
        return b
    else:
        for i in range(2, num):
            c = a+b
            a = b
            b = c
            print(b)
        return b

print(num,"th fibonacci number is ",fibonacci(num))
