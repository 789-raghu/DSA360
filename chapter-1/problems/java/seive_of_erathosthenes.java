import java.util.*;

class SieveOfEratosthenes {
    static List<Integer> sieve_of_erathosthenes(int n){
        boolean[] is_prime = new boolean[n+1];
        List<Integer> primes = new ArrayList<>();
        Arrays.fill(is_prime, true);

        for(int i = 2;i*i<=n;i++){
            if(is_prime[i]){
                for(int j = i*i;j<=n;j+=i){
                    is_prime[j] = false;
                }
            }
        }

        for(int i = 2;i<=n;i++){
            if(is_prime[i]){
                primes.add(i);
            }
        }
        return primes;
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.printf("Enter the value of n : ");
        int n = scanner.nextInt();
        List<Integer> primes = sieve_of_erathosthenes(n);
        System.out.printf(primes.toString());
    }
}