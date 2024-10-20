import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {

        Output();

    }






    public static int input() {
        Scanner odd = new Scanner(System.in);
        System.out.print("Enter no. ");
        return odd.nextInt();

    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum = sum + i;
            i += 2;
        }
        return sum;

    }

    public static void Output() {
        int nu = input();
        System.out.println("OddSum till " + nu + " is: " + oddSum(nu) );

    }
}
