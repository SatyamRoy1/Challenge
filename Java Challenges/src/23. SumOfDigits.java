import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {

        Output();

    }

    public static int input() {
        Scanner digit = new Scanner(System.in);
        System.out.print("Enter no. ");
        return digit.nextInt();

    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;

    }

    public static void Output() {
        System.out.println("Sum of Digits is: " + sumOfDigits(input()));

    }
}
