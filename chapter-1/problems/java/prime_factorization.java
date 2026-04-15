import java.util.*;

public class PrimeFactorization{
    static Scanner scanner = new Scanner(System.in);

    static void primeFactorization(int n, List<Integer> factors){
        if(n<=1){
            return;
        }
        for(int i = 2;i*i<=n;i++){
            while(n%i==0){
                factors.add(i);
                n/=i;
            }
        }

        if(n>1){
            factors.add(n);
        }
    }
    

    public static void main(String args[]){
        List<Integer> factors = new ArrayList<>();
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        primeFactorization(n,factors);
        System.out.println(factors.toString());
    }
}