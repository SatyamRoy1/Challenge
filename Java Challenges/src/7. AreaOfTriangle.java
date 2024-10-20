import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Please enter Base and Height of a triangle... ");
        float b = t.nextFloat();
        float h = t.nextFloat();
        System.out.println("This is your Area of a triangle... " + ((b*h)/2));
    }
}
