import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first no. ");
        int first = input.nextInt();
        System.out.print("Enter second no. ");
        int second = input.nextInt();
        System.out.println("LCM of the two numbers is: " + lcm(first,second));

    }

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (true){
            int factor = num1 * i;
            if (factor % num2 == 0){
                return factor;
            }
            i++;
        }

    }
}
