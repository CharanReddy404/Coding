# ofile = open('hello.txt')
# count = 0
# for i in ofile:
#     print(i)
#     count += 1
# print("")
# print("Number of lines =", count)
#
# rfile = ofile.read()
# print("count=", count)
# print("length is string in file ",len(rfile))
# print(rfile[:])

# ofile = open('hello.txt')
# # rfile = ofile.read()
# for i in ofile:
#     i = i.rstrip()
#     if(not i.startswith('From:')):
#         continue
#     print(i)

# fname = input("Enter file name: ")
#
# count = 0
# try:
#     ofile = open(fname)
# except:
#     print("File not found")
#     quit()
# print(ofile)
# for i in ofile:
#     i = i.rstrip()
#     if(not i.startswith("From:")):
#         continue
#     count +=1
#     print(i)
#
# print("count = ",count)
#
# stuff ='P\nB'
# print(len(stuff))

# ofile = open('file.txt')
# rfile = ofile.read()
# print(rfile.upper())

nlist = [5, 6, 1, 2, 3, 4]
nlist.sort()
print("Output:",nlist[0])







