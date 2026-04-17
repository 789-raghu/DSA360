import java.util.*;

class IsPrime{
    static Scanner scanner = new Scanner(System.in);

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        if(n==2 || n== 3){
            return true;
        }

        if(n%2==0 || n%3==0){
            return false;
        }

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.printf("Enter the value of n : ");
        int n = scanner.nextInt();
        scanner.close();

        if(isPrime(n)){
            System.out.printf("%d is prime\n",n);
        }
        else{
            System.out.printf("%d is not prime\n",n);
        }
    }
}