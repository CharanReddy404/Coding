# print(float(23)+20)
# print(2324/2)
# i = 1
# print(type(i))
# f = float(i)
# print(type(f))
# test = "234"
# testint = int(test)
# print(type(test))
# print(type(testint))
# #
# a = input('Enter 0')
# b = int(a) + 1
# print('converted to ', b)

def computeTotalpay(days, rate):
    totalpay = days * rate
    return totalpay

try:
    noOfDays = input('Enter the no of days: ')
    days = int(noOfDays)
    ratePerDay = input("Enter rate per day: ")
    rate = float(ratePerDay)

except:
    print("Error, please enter numeric input")

print("Pay: ",computeTotalpay(days, rate))

# def computeTotalpay(days, rate):
#     totalpay = days * rate
#     return totalpay
#
# noOfDays = int(input("Enter the no of days: "))
# days = int(noOfDays)
# ratePerDay = input("Enter rate per day: ")
# rate = int(ratePerDay)
# pay = computeTotalpay(days, rate)
# print("Pay: ", pay)




