import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Enter marks in percent... ");
        float a = g.nextFloat();

        if(a >= 90){
            System.out.println("You got A");
        } else if (a >= 75) {
            System.out.println("You got B");
        } else if (a >= 60) {
            System.out.println("You got C, Work Hard");
        } else if (a >= 30) {
            System.out.println("You got F");
        }else {
            System.out.println("You Failed");
        }

    }
}
