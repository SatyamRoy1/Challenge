import java.util.Scanner;

class BitWise {
    public static void main(String[] args) {
        Scanner bit = new Scanner(System.in);
        System.out.println("enter first number");
        int a = bit.nextInt();
        System.out.println("enter second number");
        int b= bit.nextInt();
        System.out.println("result " + (a&b));
        System.out.println("result " + (a|b));
        System.out.println("result " + (a^b));
        System.out.println("result " + (~a));
        System.out.println("result " + (a >> 1));
        System.out.println("result " + (a << 1));



        //BitWise Odd Even Calculator
        System.out.println("Please enter your no. ");
        int c = bit.nextInt();

        if( (c & 1) == 0){
            System.out.println("No. is Even ");
        }else{
            System.out.println("No. is Odd ");
        }
    }
}
