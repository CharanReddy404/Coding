#forLoop
# factorial =1
# number = input("Enter The Number: ")
# try:
#     number = int(number)
#     if number:
#        for i in range(1, number+1):
#            factorial*=i
#     print("Factorial of",number,"is",factorial)
# except:
#     print("Error, enter numbers only!")
#     print("Exit!")

#whileLopp
factorial = 1
i = 1
number = input("Enter The Number: ")
try:
    number = int(number)
    if number:
        while i <= number:
            factorial *= i
            i += 1
        print("Factorial of", number, "is", factorial)
except:
    print("Error, enter numbers only!")
print("Exit!")