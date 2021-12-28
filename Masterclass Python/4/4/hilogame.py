low = 1
high = 1000

print("Think a number between {} and {}".format(low, high))
input("Enter to Start")

guesses = 1

while True:
    guess = low + (high - low) // 2
    high_low = input("the guess value is {}. Enter h for high, l for low or c if it is correct:\n".format(guess))
    if high_low == "h":
        low = guess + 1
    elif high_low == "l":
        high = guess - 1
    elif high_low == "c":
        print(" i got it in {} guess".format(guesses))
        break
    else:
        print("Enter h, l, or c")

    guesses = guesses + 1