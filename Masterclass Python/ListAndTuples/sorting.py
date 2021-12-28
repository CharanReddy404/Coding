odd = [1, 3, 5, 7, 9]
even = [2, 4, 6, 8]

even.extend(odd)
print(even)
so = sorted(even)
print(so)
even.sort(reverse=True)
print(even)