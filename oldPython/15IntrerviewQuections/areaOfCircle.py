# area of circle pi*r²

radius = float(input('Enter the radius: '))
def squar(r):
    sqr = r*r
    return sqr
def area(radius):
    pi = 3.142
    area= float(pi*squar(radius))
    print("Area of circle is",area)
    return area
area(radius)