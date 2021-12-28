ofile = open('file.txt')
for i in ofile:
    i = i.rstrip()
    sfile = i.split()
    print(sfile)
    print(sfile[2])