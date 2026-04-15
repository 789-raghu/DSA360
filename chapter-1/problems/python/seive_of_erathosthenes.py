def seive_of_erathosthenes(n : int)-> [int]:
    is_prime = [True for i in range(n+1)]
    primes = []
    i = 2

    while i*i<=n:
        if(is_prime[i]):
            j = i*i
            while j<=n:
                is_prime[j] = False
                j+=i
        i+=1
    
    for index in range(len(is_prime)):
        if(is_prime[index]):
            primes.append(index);
    return primes

n = int(input('Enter the value of n : '))
result = seive_of_erathosthenes(n)
print(result)