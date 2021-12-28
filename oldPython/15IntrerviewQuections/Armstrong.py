print("Armstrong Number Or Not")
num = int(input("Enter Number: "))

def cubeOfNumber(x):
    cube = pow(x, 3)
    return cube

def armstrong(number):
    arm = 0
    n = number
    while n != 0:
        remainder = int(n % 10)
        cube = cubeOfNumber(remainder)
        arm = arm + cube
        n = int(n/10)
    if number == arm:
        print("its is Armstrong Number")
    else:
        print("its not a Armstrong Number")

armstrong(num)