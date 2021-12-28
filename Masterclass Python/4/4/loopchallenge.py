import random
highest = 10
answer = random.randint(1, highest)
# print(answer)

print("Guess the number between 1 to {0}".format(highest))
# guess = int(input("Enter Guess Number:\n"))
count = 0
while True:
    guess = int(input("Enter Guess Number: "))
    count += 1
    if guess == answer:
        print("your guess {0} is right".format(answer))
        break
    elif guess <= answer:
        print("guess higher")
    elif guess >= answer:
        print("guess lower")
    else:
        print("invalid input")


print("no of guess is {}".format(count))