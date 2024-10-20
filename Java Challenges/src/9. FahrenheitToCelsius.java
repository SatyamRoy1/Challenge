import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter Fahrenheit.. ");
        float F = f.nextFloat();
        System.out.println("Your temperature is " +((F-32)*5/9) + "C");
    }
}
