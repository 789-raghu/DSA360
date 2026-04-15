#include<bits/stdc++.h>

using namespace std;

void prime_factorization(int n, unordered_set<int>& factors) {
    for (int i = 2; i * i <= n; i++) {
        while (n % i == 0) {
            factors.insert(i);
            n /= i;
        }
    }
    if (n > 1) factors.insert(n);
}

int main(){
    int n;
    cout<< "Enter the value of n : ";
    cin>>n;
    unordered_set<int> factors;

    prime_factorization(n,factors);

    for(auto i: factors){
        cout<<i<<" ";
    }
    return 0;
}