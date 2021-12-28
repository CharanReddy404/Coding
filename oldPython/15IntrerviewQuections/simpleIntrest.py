simpleInterest = 0
print("Program To Calculate The Simple Interest:")
principal = input("Enter Principal Amount: ")
try:
    P = float(principal)
    if P:
        time = input("Enter Time: ")
        try:
            T = float(time)
            if T:
                rate = input("Enter Interest Rate: ")
                R = float(rate)
                if R:
                    simpleInterest = (P*T*R)/100
                else:
                    print("Error, Invalid Interest Rate Input Value!")
            print("Simple Interest is",simpleInterest)
           #print("Amount per month:",(simpleInterest+P)/T)
            print("Total Amount To Pay:", simpleInterest+P)
        except:
            print("Error, Invalid Time Input Value!")

except:
    print("Error, Invalid Principle Input Value!!")
print("EXIT....")
