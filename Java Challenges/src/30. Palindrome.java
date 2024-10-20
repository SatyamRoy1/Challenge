import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. ");
        int a = input.nextInt();
        boolean palindrome = PalinDrome(a);

        if (palindrome){
            System.out.println("Your no. is palindrome");
        }else {
            System.out.println("Your no. is not palindrome");
        }

    }

    public static boolean PalinDrome(int num) {
        int palin = 0;
        int oldnum = num;
        while (num > 0){
            int digit = num % 10;
            palin = palin * 10 + digit;
            num /= 10;
        }
        System.out.println("\nNo. before reverse is " + oldnum +  "\nNo. after reverse is " + palin + "\n");
        return oldnum == palin;
    }
}
