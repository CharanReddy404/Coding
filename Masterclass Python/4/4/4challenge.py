print("*****Welcome*****")
def menu():
      print("Please choose your option from the list below:\n"
      "1. Learn Python\n"
      "2. Learn Java\n"
      "3. Going Swimming\n"
      "4. Have Dinner\n"
      "5. Go to Bed\n"
      "6. Menu"
      "0. Exit\n")

menu()
while True:

      n = input("Enter Your Choice:\n")
      try:
            n = int(n)
            if n == 1:
                  print("Start Learning Python")
            elif n == 2:
                  print("Start Learning Java")
            elif n == 3:
                  print("Let's Go For Swimming")
            elif n == 4:
                  print("Time For Dinner")
            elif n == 5:
                  print("Time To Sleep, Go To Bed")
            elif n == 6:
                  menu()
            elif n == 0:
                  print("Exit")
                  break
            else:
                  print("Invalid Choice")
      except:
            print("Enter Only Numbers")



