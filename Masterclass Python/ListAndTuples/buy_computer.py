current_choice = "-"
available_parts = ["Computer", "monitor", "keyboard", "mouse", "hdmi cable", "ram"]
computer_parts = []
valid_choices = [str(i) for i in range(1, len(available_parts)+1)]
# for i in range(1, len(available_parts)+1):
#     valid_choices.append(str(i))
# print(valid_choices)
while current_choice != "0":
    if current_choice in valid_choices:
        index = int(current_choice)-1
        chose_part = available_parts[index]
        # computer_parts.append(chose_part)
        if chose_part in computer_parts:
            computer_parts.remove(chose_part)
            print("Removing {}".format(current_choice))
        else:
            computer_parts.append(chose_part)
            print("Adding {}".format(current_choice))
        print("Your list contains: {}".format(computer_parts))
        # if current_choice == "1":
        #     computer_parts.append("Computer")
        # elif current_choice == "2":
        #     computer_parts.append("monitor")
        # elif current_choice == "3":
        #     computer_parts.append("keyboard")
        # elif current_choice == "4":
        #     computer_parts.append("mouse")
        # elif current_choice == "5":
        #     computer_parts.append("mouse pad")
        # elif current_choice == "6":
        #     computer_parts.append("hdmi cable")
    else:
        for num, parts in enumerate(available_parts):
            print("{}: {}".format(num+1, parts))
        # for i in available_parts:
        #     print("{0}: {1}".format(available_parts.index(i)+1, i))
        # print("Add option to the list:\n"
        #       "1: computer\n"
        #       "2. monitor\n"
        #       "3. keyboard\n"
        #       "4: mouse\n"
        #       "5. mouse pad\n"
        #       "6. hdmi cable\n"
        #       "0. finish")
    current_choice = input("Enter You Choice: ")

print(computer_parts)