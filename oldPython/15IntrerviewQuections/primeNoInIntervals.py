#prime number or not

start = int(input("Enter Start Number: "))
end = int(input("Enter End Number: "))
print("The Prime No Between The Numbers", start,"And", end,"is: ")
for i in range(start, end+1):
    if i > 1:
        for j in range(2, i//2+2):
            if (i % j) == 0:
                break
            else:
                if j == i//2+1:
                    print(i)
print("End...")