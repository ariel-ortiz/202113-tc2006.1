def factorial(n):
    i = 1
    result = 1
    while i <= n:
        i, result = i + 1, result * i
    return result
  
print(factorial(5))
    