import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.println("Welcome to Addition Point");
        System.out.println("Please enter your first number....");
        int a = add.nextInt();
        System.out.println("Please enter your second number....");
        int b = add.nextInt();
        int c = a+b;
        System.out.println("Here is your addition... " + c );
    }
}
