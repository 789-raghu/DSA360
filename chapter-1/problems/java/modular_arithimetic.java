import java.util.*;

class ModularArithimetic{
    static Scanner scanner = new Scanner(System.in);

    static int binaryAddition(int a,int b, int m){
        return ((a%m)+(b%m))%m;
    }

    static int binarySubtraction(int a,int b, int m){
        return ((a%m)-(b%m)+m)%m;
    }

    static int binaryMultiplication(int a,int b,int m){
        return ((a%m)*(b%m))%m;
    }

    static int binaryDivision(int a,int b,int m) {
        int inverse = modularInverse(b, m);
        if(inverse == -1) return -1;
        return (a*inverse)%m;
    }

    static int modularExponentiation(int a, int b, int m){
        if(b==0){
            return 1;
        }

        int result = modularExponentiation(a,b/2,m);

        if(b%2){
            return (((result*result)%m)*b)%m;
        }

        return (result*result)%m;
    }

    static int modularInverse(int b,int m){
        BigInteger b = new BigInteger.valueOf(b);
        BigInteger m = new BigInteger.valueOf(m);
        if(a.gcd(b)!=1){
            return modularExponentiation(a,m-2,m);
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.printf("Enter the values of a, b, m : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
    }
}