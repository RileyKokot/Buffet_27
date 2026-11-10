print("please enter a number: ")
x = input()
y = 0
for b in range(1,int(x)):
    print(b, end="+")
    y =y + b

print(x)
y = y + int(x)

print("The sum of 0 to " + x + " is " + str(y))