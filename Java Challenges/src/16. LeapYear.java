import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter your year you want to check");
        double a = year.nextDouble();

        if (a % 400 == 0 || (a % 4 == 0 && a%100 !=0)){
            System.out.println(a + " Year is leap year.");
        }else{
            System.out.println(a + " Year is not leap year.");
        }
    }
}
