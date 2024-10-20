import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println(" please enter all sides of rectangle in centimeters... ");
        double a = p.nextDouble();
        double b = p.nextDouble();
        double c = p.nextDouble();
        double d = p.nextDouble();
        System.out.println("This is your perimeter of rectangle... " +(a+b+c+d) + " cm");

    }
}
