sum = 0
num1 = input("Enter First Number: ")
try:
    num1 = int(num1)
    if num1:
        num2= input("Enter Second Number: ")
        try:
            num2 = int(num2)
            if num2:
                sum = num1 + num2
                print("Sun Of",num1,"and",num2,"is",sum)
        except:
            print("Error, enter numbers only")
except:
    print("Error, enter numbers only")
print("End.....")