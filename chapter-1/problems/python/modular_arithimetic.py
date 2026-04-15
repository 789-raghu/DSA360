def modular_addition(a : int, b : int, m : int) -> int:
    return ((a%m) + (b%m))%m

def modular_subtraction(a : int, b : int, m : int) -> int:
    return ((a%m) - (b%m) + m)%m

def modular_multiplication(a : int, b : int, m : int) -> int:
    return ((a%m) * (b%m))%m

def modular_exponentitation(a: int, b : int, m: int)-> int:
    if b==0:
        return 1
    answer = modular_exponentitation(a,b//2,m)

    if b%2:
        return ((answer*amswer)*(a%m))%m
    return (result*result)%m

def modular_inverse(b: int, m: int) -> int:
    if(math.gcd(b,m)!=1):
        return -1
    
    return modular_exponentiation(b,m-2,m)

def modular_division(a : int, b : int, m : int) -> int:
    inverse = (modular_inverse(b,m))

    if inverse!=-1:
        return ((a%m)*inverse)%m