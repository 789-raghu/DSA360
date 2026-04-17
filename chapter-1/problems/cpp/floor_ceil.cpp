#include<bits/stdc++.h>

using namespace std;

int floor_div(int a, int b){
    if((a ^ b) >= 0){
        return a/b;
    }
    return a/b - ((a%b)!=0);
}

int ceil_div(int a,int b){
    if((a ^ b) >= 0){
        return a/b+((a%b)!=0);;
    }
    return a/b;
}


int main(){
    int a, b;
    cout<<"Enter the values of a and b : ";
    cin>>a>>b;
}