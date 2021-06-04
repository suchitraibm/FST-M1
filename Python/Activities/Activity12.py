def sum(n):
  if n == 1:
    return n
  else:
    return n + sum(n-1)
  
print("The sum of 10 is: ", sum(10))