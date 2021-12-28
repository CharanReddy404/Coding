fname = input("Enter file name: ")
try:
    ofile = open(fname)
except:
    print("Error, file not found!!!")
    quit()
d = dict()
for i in ofile:
    i = i.rstrip()
    sfile = i.split()
    print(sfile)
    for j in sfile:
        d[j] = d.get(j,0)+1

largest = -1
word = None
for a,b in d.items():
    print(a,b)
    if b > largest:
        largest = b
        word = a

print("Done",word,largest)