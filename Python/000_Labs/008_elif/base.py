n1 = input("Please enter a number: ") 
o1 = input("Please enter an operation: ") 
n2 = input("Please enter another number: ") 

if o1 == "-": 
    minus = int(n1) - int(n2) 
    print(n1 + " minus " + n2 + " equals " + str(minus)) 
elif o1 == "+": 
    adi = int(n1) + int(n2) 
    print(n1 + " plus " + n2 + " equals " + str(adi)) 
elif o1 == "*": 
    mulit = int(n1) * int(n2) 
    print(n1 + " times " + n2 + " equals " + str(mulit)) 
elif o1 == "/": 
    div = int(n1) / int(n2) 
    print(n1 + " divided by " + n2 + " equals " + str(div)) 
elif o1 == "%": 
    coco = int(n1) % int(n2) 
    print(n1 + " divided by " + n2 + " equals " + str(coco))
else: 
    print("Hey, that's not nice. Pick an operation.")