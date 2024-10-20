import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your number... ");
        int i = a.nextInt();
        if(i % 2 == 0){
            System.out.println("Your no. is even");
        }else{
            System.out.println("Your no. is odd");
        }
    }
}
