name = input("Enter your name: ")
age = int(input("Enter your age {0} : ".format(name.upper())))
print("{0} is {1} years old".format(name.upper(), age))

if age>=18 and age<=31:
    print("hey, {0}. your welcome to holidays".format(name.upper()))
else:
    print("Soory, {0} you should be 18 to 31 years old for holidays".format(name.upper()))