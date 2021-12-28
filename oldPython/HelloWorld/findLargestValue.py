#
# sum = 0
# count = 0
# for i in [1,2,3,4,5,6,7,8,9]:#[32,4,23,53,545,543]:
#     sum += i
#     count +=1
#     print(i)
#
# avg = sum/count
# print("sum of element is ",sum)
# print("average of element is ",avg)

# for i in [1,2,3,4,5,6,7,8,9]:
#     if i<=5:
#         print(i)
# print("END LOOP")

smallest = None
for i in [-56,1,2,3,4,5,6,7,8,9]:
    if smallest is None:
        smallest=i
    elif i < smallest:
        smallest = i
print("Smallest is ",smallest)