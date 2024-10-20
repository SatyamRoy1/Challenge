import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please Enter number...");
        int b = a.nextInt();

        if(b>0){
            System.out.println("Your number is positive");
        } else if (b<0) {
            System.out.println("Your number is negative");
        }else {
            System.out.println("your number is zero");
        }
    }
}
