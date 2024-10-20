import java.util.Scanner;

class AgeGroups {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Enter marks in percent... ");
        float a = g.nextFloat();

        if(a <= 13){
            System.out.println("You are a child");
        } else if (a <= 20 ) {
            System.out.println("You are a teen");
        } else if (a <= 60) {
            System.out.println("You are a adult");
        } else if (a >= 60) {
            System.out.println("You are a senior");
        }else {
            System.out.println("You are a budhaa near to death be ready");
        }
    }
}
