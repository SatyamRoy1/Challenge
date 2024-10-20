import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner great = new Scanner(System.in);
        System.out.println("Enter your 1st no.");
        int a = great.nextInt();
        System.out.println("Enter your 2nd no.");
        int b = great.nextInt();
        System.out.println("Enter your 3rd no.");
        int c = great.nextInt();

        if(a >= b && a >= c){
            System.out.println(a +" is the Greatest");
        } else if (b >= c) {
            System.out.println(b +" is the Greatest");
        }else{
            System.out.println(c +" is the Greatest");
        }
    }
}
