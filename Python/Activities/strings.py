print("Hello")
print('Hello') 

	
a = "Hello"
	
print(a) # Output: "Hello"

a = """Lorem ipsum dolor sit amet,
	
consectetur adipiscing elit,
	
sed do eiusmod tempor incididunt
	
ut labore et dolore magna aliqua."""
print(a) 
a="Hello, World!"
print(a[0]) # Output: "e"
b = "Hello, World!"
print(b[0:4]) # Output: "llo"
print(len(a)) # Output: 13
print(a.lower()) # Output: "hello, world!"
print(a.upper()) # Output: "HELLO, WORLD!"
print(a.replace("H", "J")) # Output: "Jello, World!"
print(a.split(",")) # returns ['Hello', ' World!'] 

txt = "The rain in Spain stays mainly in the plain"
x1 = "ain" in txt
x2 = "pain" in txt
y1 = "ain" not in txt
y2 = "stay" not in txt
print(x1,y1) # True # False
print(x2,y2) # True # False


##################
a = "Hello"
b = " World"
c = a + b
print(c) # "Hello World"

age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

# Output: My name is John, and I am 36

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item no {} for {} dollars."
print(myorder.format(quantity, itemno, price))

# Output: I want 3 pieces of item 567 for 49.95 dollars.

quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item no. {1}"
print(myorder.format(quantity, itemno, price))

# Output: I want to pay 49.95 dollars for 3 pieces of item 567.