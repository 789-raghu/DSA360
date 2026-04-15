# Math and combinatorics

## Is Prime

### Intuition
A prime number is a number that is only divisible by 1 and itself. To check if a number $n$ is prime, we can try to divide it by all numbers from 2 up to $n-1$. If we find any number that divides $n$ evenly, then $n$ is not prime.

### Approach
1. Handle base cases: numbers $\le 1$ are not prime. 2 and 3 are prime.
2. We can optimize the process by checking for divisibility only up to $\sqrt{n}$.
3. A further optimization is to check for divisibility by 2 and 3, and then iterate through numbers of the form $6k \pm 1$ up to $\sqrt{n}$.

### Time and Space Complexity
- **Time Complexity:** $O(\sqrt{n})$
- **Space Complexity:** $O(1)$

## Prime Factorization

### Intuition
To find the prime factorization of a number, we can find all the prime numbers that divide the given number.

### Approach
1.  Iterate from 2 up to $\sqrt{n}$.
2.  If $i$ divides $n$, add $i$ to the list of factors and divide $n$ by $i$ repeatedly until it is no longer divisible.
3.  If $n > 1$ after the loop, then the remaining $n$ is also a prime factor.

### Time and Space Complexity
- **Time Complexity:** $O(\sqrt{n})$
- **Space Complexity:** $O(\log n)$ for storing the factors.

## Sieve of Eratosthenes

### Intuition
To find all prime numbers up to a given number $n$, we can start by assuming all numbers are prime and then iteratively mark the multiples of prime numbers as not prime.

### Approach
1.  Create a boolean array `isPrime` of size $n+1$ and initialize all entries to `true`.
2.  Mark 0 and 1 as not prime.
3.  Iterate from 2 up to $\sqrt{n}$.
4.  If `isPrime[p]` is `true`, then $p$ is a prime number. Mark all multiples of $p$ from $p^2$ to $n$ as `false`.
5.  All numbers $p$ for which `isPrime[p]` is `true` are prime numbers.

### Time and Space Complexity
- **Time Complexity:** $O(n \log \log n)$
- **Space Complexity:** $O(n)$

## Smallest Prime Factor (SPF)

### Intuition
The Smallest Prime Factor (SPF) algorithm is an extension of the Sieve of Eratosthenes. Instead of just marking numbers as prime or not, it stores the smallest prime factor for each number up to a certain limit. This allows for very fast prime factorization.

### Approach
1.  Create an array `spf` of size $n+1$ and initialize `spf[i] = i` for all $i$.
2.  Iterate from $p=2$ up to $\sqrt{n}$.
3.  If `spf[p] == p`, then $p$ is a prime number.
4.  For all multiples of $p$, say $i$, from $p^2$ to $n$, if `spf[i] == i`, then update `spf[i] = p`.
5.  To find the prime factorization of a number $x$, repeatedly print `spf[x]` and update $x = x / spf[x]$ until $x=1$.

### Time and Space Complexity
- **Sieve Precomputation:** $O(n \log \log n)$
- **Prime Factorization:** $O(\log n)$
- **Space Complexity:** $O(n)$

## Modular Arithmetic

### Intuition
Modular arithmetic is a system of arithmetic for integers, where numbers "wrap around" upon reaching a certain value—the **modulus**. A key property is that the result of any arithmetic operation will be within the range $[0, m-1]$, where $m$ is the modulus.

### Properties
- **Modular Addition:** $(a + b) \% m = ((a \% m) + (b \% m)) \% m$
- **Modular Subtraction:** $(a - b) \% m = ((a \% m) - (b \% m) + m) \% m$
- **Modular Multiplication:** $(a \times b) \% m = ((a \% m) \times (b \% m)) \% m$

### Modular Exponentiation (Binary Exponentiation)
To calculate $(a^b) \% m$ efficiently, especially for a large $b$, we use binary exponentiation.

#### Approach
1. Initialize `res = 1`.
2. Reduce $a$ to $a \% m$.
3. While $b > 0$:
    - If $b$ is odd, `res = (res * a) % m`.
    - Square $a$: $a = (a \times a) \% m$.
    - Halve $b$: $b = b / 2$.
4. Return `res`.

- **Time Complexity:** $O(\log b)$
- **Space Complexity:** $O(1)$ (iterative)

### Modular Multiplicative Inverse
The modular multiplicative inverse of an integer $a$ is an integer $x$ such that $ax \equiv 1 \pmod{m}$. The inverse, denoted as $a^{-1}$, exists if and only if $a$ and $m$ are coprime (i.e., $\text{gcd}(a, m) = 1$).

#### Using Fermat's Little Theorem
If $m$ is a prime number, we can find the inverse using Fermat's Little Theorem, which states that for any integer $a$ not divisible by $m$:
$$a^{m-1} \equiv 1 \pmod{m}$$
This can be rearranged to:
$$a^{m-2} \equiv a^{-1} \pmod{m}$$
Thus, we can calculate the modular inverse of $a$ by computing $(a^{m-2}) \% m$ using modular exponentiation.

- **Time Complexity:** $O(\log m)$
- **Space Complexity:** $O(1)$
