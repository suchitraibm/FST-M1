fstnumbers = list(input("Enter a sequence of comma separated Numbers: ").split(","))
secnumbers = list(input("Enter a sequence of comma separated Numbers: ").split(","))
trdnumbers=[]
for fstnumber in fstnumbers:
    if (int(fstnumber) % 2 !=0):
        trdnumbers.append(fstnumber)
for secnumber in secnumbers:
    if (int(secnumber) % 2 ==0):
        trdnumbers.append(secnumber)

print("Final List is")
print(trdnumbers)