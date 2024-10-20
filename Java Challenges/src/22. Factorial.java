import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {

        output();

    }

    public static int input() {
        Scanner f = new Scanner(System.in);
        System.out.print("enter any no. ");
        return f.nextInt();

    }

    public static long factorial(int num) {
        if(num < 2){
            return 1;
        }

        long F = 1;
        int i = 2;
        while (i <= num){
            F *= i;
            i++;
        }
        return F;

    }

    public static void output() {
        System.out.println("Factorial is: " + factorial(input()));

    }
}
