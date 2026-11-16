symbol = input("What symbol would you like to use? ")
width = int(input("Whats the width of your box? "))
height = int(input("Whats the height of your box? "))


for x in range(height):
    print(symbol * width)