import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. ");
        int num = input.nextInt();
        System.out.println("Reverse of your no. is: " + reverse(num));
    }

    public static int reverse(int num) {
        int newnum = 0;
        while (num > 0){
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        }
        return newnum;
    }
}
