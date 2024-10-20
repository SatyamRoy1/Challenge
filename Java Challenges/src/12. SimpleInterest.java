import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Please Enter Principle, Rate and Time... ");
        float p = i.nextFloat();
        double r = i.nextDouble();
        int t = i.nextInt();
        System.out.println("this is your simple interest.... " +((p*r*t)/100));
    }
}
