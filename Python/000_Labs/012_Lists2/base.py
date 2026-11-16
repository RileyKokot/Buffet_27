import random

# 1. Ask the user how many numbers they want
count = int(input("How many random numbers would you like? "))

# 2. Create a list and fill it with random numbers (as strings for easy formatting)
numbers = []
for _ in range(count):
    random_num = str(random.randint(1, 10))
    numbers.append(random_num)

# 3. Join the numbers with commas and print the result
output = ", ".join(numbers)
print("Your numbers are:", output)