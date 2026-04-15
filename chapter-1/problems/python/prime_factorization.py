from math import *

def primeFactorization(n : int, factors : [int] = []) -> None:
    for i in range(2,ceil(sqrt(n)+1)):
        while n%i==0:
            factors.append(i)
            n//=i
    if n>1:
        factors.append(n)

def prime_sieve(spf : [int])-> None:
    size = 10**6
    for i in range(2,ceil(sqrt(size)+1)):
        if(spf[i]==i):
            for j in range(i*i,size+1,i):
                spf[j] = i

def prime_factorization_sieve(n : int, spf : [int]) -> [int]:
    factors = []
    while n>1:
        factors.append(spf[n])
        n//=spf[n]
    return factors

factors = []
spf = [i for i in range((10**6)+1)]
n = int(input('Enter the values of n : '))
primeFactorization(n,factors)
prime_sieve(spf)
print(prime_factorization_sieve(n,spf))
print(factors)
