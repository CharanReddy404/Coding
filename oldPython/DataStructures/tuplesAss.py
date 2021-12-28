# fname = input("Enter file name: ")
# try:
#     ofile = open(fname)
# except:
#     print("Error, file not found!!!")
#     quit()
#
# d= dict()
# for i in ofile:
#     i = i.rstrip()
#     sfile = i.split()
#     for j in sfile:
#         d[j] = d.get(j,0)+1
# l = list()
# for a,b in d.items():
#     l.append((b,a))
#     sorted(l, reverse=True)
#     print(a,b)

# a={4,5,6}
# b={2,3,4}
# print(a|b)