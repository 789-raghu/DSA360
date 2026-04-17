import java.util.Scanner;

class FloorCeil{
    static int floor_div(int a, int b){
        if((a^b)>=0){
            return a/b;
        }
        return a%b!=0 ? a/b-1 : a/b;
    }

    static int ceil_div(int a, int b){
        return (a+b-1)/b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter the values of a, b : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("Floor Division : %d\n",floor_div(a,b));
        System.out.printf("Ceiling Division : %d\n",ceil_div(a,b));
    }
}