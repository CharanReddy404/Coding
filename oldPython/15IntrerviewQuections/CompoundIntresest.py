print("Program to calculate Compound Interest")
def compound_interest(principal, time, rate):
    ci = principal*(pow(1+(rate/100), time))
    print("Compound Interest is :",ci)
    #return ci

P = float(input("Input: P: "))
T = float(input("       T: "))
R = float(input("       R: "))

compound_interest(P,T,R)