shopping_list = ["a", "b", "c", "d"]
demo_list = shopping_list
print(shopping_list)
demo_list.append("e")
print()
print(demo_list)
print(shopping_list)
a = b = c = d = demo_list
a.append("f")
b.append("g")
print(c)
print()
print(d)
print(demo_list)
print(shopping_list)