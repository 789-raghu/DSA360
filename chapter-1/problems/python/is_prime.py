def isPrime(n : int)-> bool:
    if n<=1:
        return False
    
    if n==2 or n==3:
        return True
    
    if n%2==0 or n%3==0:
        return False
    
    for i in range(2,ceil(sqrt(n))+1):
        if n%i==0:
            return False
    
    return True

n = int(input("Enter the value of n : "))

if(isPrime(n)):
    print(f"{n} is prime")
else:
    print(f"{n} is not prime")