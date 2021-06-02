username = input("Enter username: ")
print("Username is: " + username)
age = 32
txt= "I am {}"
print(txt.format(age))

username = input("Enter username: ")
print("Username is: " + username)
age = input("Enter age: ")
print("age is: " + age)

########

username = input("Enter your name: ")
age = int( input("Enter your age: ") )
year = str( ( 2021 - age ) + 100 )
print(username + " will be 100 years old in the year " + year)