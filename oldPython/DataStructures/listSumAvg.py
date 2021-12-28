nlist = list()
total = 0
avg = 0
count = 0
while True:
    value = input("Enter Number: ")
    if value == 'done':
        break
    value = float(value)
    nlist.append(value)
    count += 1
print("count =",count)
for i in nlist:
    total += i

print("Sum is", total)
avg = total/count
print("avg =", avg)
