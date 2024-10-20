import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);
        System.out.println("Welcome to Swap Universe");
        System.out.println("Please enter your first number A....");
        int a = swap.nextInt();
        System.out.println("Please enter your second number B....");
        int b = swap.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Here is your Swap number A... " +a );
        System.out.println("Here is your Swap number B... " +b );
    }
}
