# for i in range(1,13):
#     print("No. {:2} squared is {:3} and cubed is {:4}".format(i, i**2, i**3))
#     print("*"*40)
# print("...............THE END.................")
# print("*"*40)

name = input("Enter your name: ")
age = int(input("Enter your age \"{0}\": ".format(name)))
print("{} is {} years old".format(name.upper(), age))

if age >= 18:
    print("Your older Enough to Vote {0}".format(name.upper()))
else:
    print("Your Not older Enough to Vote {0}".format(name.upper()))
    print("Come back after {0} years".format(18-age))












