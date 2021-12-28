sum = 0
avg = 0
count = 0

while True:
    num = input("Enter the numbers: ")
    try:
        if num == 'exit':
            break
        num = int(num)
        sum+=num
        count+=1
    except:
        print("enter number only!")
        continue
avg=sum/count
print("Sum of numbers is ",sum)
print("Count of numbers is ",count)
print("Average of numbers is ",avg)