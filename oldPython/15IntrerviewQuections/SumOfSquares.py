num = int(input("Enter the number: "))

def sqr(i):
    return i*i

def sum_of_sqr(num):
    add = 0
    if num < 0:
        print("incorrect number!!")
    else:
        for i in range(1, num+1):
            a = sqr(i)
            print(a)
            add += a
        return add
print("the sum of squares is ",sum_of_sqr(num))

