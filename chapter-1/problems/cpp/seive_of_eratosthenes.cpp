#include<bits/stdc++.h>

using namespace std;

vector<int> seive_of_erathosthenes(int n){
    vector<int> primes;
    vector<bool> is_prime(n+1,true);

    for(int i = 2;i*i<=n;i++){
        if(is_prime[i]){
            for(int j = i*i;j<=n;j+=i){
                is_prime[j] = false;
            }
        }
    }

    for (int i = 2; i <= n; i++) {
        if (is_prime[i]) {
            primes.push_back(i);
        }
    }
    return primes;
}

int main(){
    int n;
    cout<<"Enter the number n : ";
    cin>>n;

    vector<int> primes = seive_of_erathosthenes(n);

    for(auto i:primes){
        cout<< i << " ";
    }

    return 0;
}