import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. ");
        int num = input.nextInt();
        boolean Prime = isPrime(num);
        if (Prime){
            System.out.println("Your no. is prime");
        }else{
            System.out.println("Your no. is not prime");
        }

    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
