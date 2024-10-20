import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Please Enter Principle, interest and Years... ");
        float p = c.nextFloat();
        double i = c.nextDouble();
        int y = c.nextInt();
        System.out.println("this is your compound interest.... " +(p*Math.pow((1+i/100),y)));
    }
}
