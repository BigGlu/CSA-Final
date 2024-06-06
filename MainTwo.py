import math

print("Welcome to My Quadratic Formula Solver")
print("Please enter a,b, and c where ax^2 + bx + c = 0")

a = float(input("a="))
b = float(input("b="))
c = float(input("c="))

print("\n")

# Step 1
print("x = " + str(b*-1) + " +/- sqrt(" + str(b) + "^2 -4*" + str(a) + "*" + str(c) + ")")
print("     ___________________________________________________________")
print("     2*" + str(a))

print("\n")

# Step 2
print("x = " + str(b*-1) + " +/- sqrt(" + str(math.pow(b, 2)) + " + " + str(-4*a*c) + ")")
print("     ___________________________________________________________")
print("              " + str(2*a))

print("\n")

# Step 3
print("x = " + str(b*-1) + " +/- sqrt(" + str((math.pow(b, 2) + -4*a*c)) + ")")
print("     ___________________________________________________________")
print("              " + str(2*a))

print("\n")

# Step 4
print("x = " + str(b*-1) + " +/- " + str(math.sqrt(math.pow(b, 2) + -4*a*c)))
print("     ___________________________________________________________")
print("              " + str(2*a))

print("\n")

# Step 5
print("x=(" + str((b*-1 + math.sqrt(math.pow(b, 2) + -4*a*c))/(2*a)) + "," + str((b*-1 - math.sqrt(math.pow(b, 2) + -4*a*c))/(2*a)) + ")")
