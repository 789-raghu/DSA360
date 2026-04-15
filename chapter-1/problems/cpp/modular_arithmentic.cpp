#include<bits.stdc++.h>

using namespace std;

int modular_addition(int a,int b, int m){
    return ((a%m) + (b%m))%m;
}

int modular_subtraction(int a,int b, int m){
    return ((a%m)-(b%m) + m)%m;
}

int modular_multiplication(int a,int b,int m){
    return ((a%m)*(b%m))%m;
}

int modular_exponentiation(int a,int b,int m){
    if(b==0){
        return 1;
    }
    long long result = modular_exponentiation(a,b/2,m);

    if(b%2){
        return (result*result*(a%m))%m;
    }

    return (result*result)%m;
}

long long modular_inverse(long long b,int m){
    if(__gcd(b, m) != 1){
        return -1;
    }
    return modular_exponentiation(b, m - 2, m);
}


long long modular_division(long long a,long long b,int m){
    long long inv = modular_inverse(b, m);
    if(inv == -1) return -1;
    return modular_multiplication(a, inv, m);
}

int main(){

}