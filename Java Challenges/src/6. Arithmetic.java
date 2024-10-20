import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter your first number A....");
        int a = q.nextInt();
        System.out.println("Please enter your second number B....");
        int b = q.nextInt();
        System.out.println("Addition.... " + (a+b));
        System.out.println("Subtraction.... " + (a-b));
        System.out.println("Multiplication.... " + (a*b));
        System.out.println("Divison.... " + (a/b));
        System.out.println("Mod.... " + (a%b));
    }
}
