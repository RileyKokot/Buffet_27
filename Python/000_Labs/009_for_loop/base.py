print("Please enter a length for the line: ")
inn = input()

print("Please enter whether you want it vertical or horizontal: ")
inN = input()

x = "*"
z = "*"

if inN == "vertical":
  for y in range(int(inn)):
    print(x)
elif inN == "horizontal":
  for y in range(int(inn)):
    print(z, end="")
  print()  # Moves to a new line after the horizontal line finishes
else:
  print("Hey thats not nice. Either vertical or horizontal!")

