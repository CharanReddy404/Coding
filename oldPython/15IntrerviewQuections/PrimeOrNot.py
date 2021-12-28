#prime number or not

num = int(input("Enter Number: "))

def prime(num):
    if num==0 | num==1:
        print(num, 'is not a prime number')
    elif num%2==0:
        print(num,"is not a prime number")
    else:
        print(num,"is a prime number")

prime(num)