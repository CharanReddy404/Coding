# a = input("Enter Value: ")
# try:
#     a = int(a)
#     print("Conversion Successful")
# except:
#     a =-1
# print("value", a)
#
# if a>0:
#     print("Nice Work")
# else:
#     print("Not A Number")

a = input("Enter Value 1: ")
b = input("Enter Value 2: ")
try:
    a = int(a)
    b = int(b)
    div = a/b
    print("Divided Successfully div= ",div)
except:
    div =-1
print("value is ", div)

if div>0:
    print("Nice Work, divided")
else:
    print("Sorry, ",a, "can't be divided by ",b)