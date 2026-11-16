import random

# 1. Create a list of 5 different one-line jokes
jokes = [
    "Why don't scientists trust atoms? Because they make up everything!",
    "I told my doctor that I broke my arm in two places. He told me to stop going to those places.",
    "Why did the scarecrow win an award? Because he was outstanding in his field!",
    "What do you call a fake noodle? An impasta.",
    "Why do we tell actors to 'break a leg'? Because every play has a cast."
]

# 2. Generate a random number based on the list length
random_index = random.randint(0, 4)

# 3. Print the random joke out
print(jokes[random_index])