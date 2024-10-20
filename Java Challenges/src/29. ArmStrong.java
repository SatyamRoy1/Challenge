import java.util.Scanner;

class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no. ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);

        if (isArmstrong){
            System.out.println("Your number is Armstrong");
        }else{
            System.out.println("Your number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        System.out.println("No Of Digits " + noOfDigits);
        int oldNum = num;
        int finalNumber = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        System.out.println("final number is: " + finalNumber + " num " + oldNum);
        return finalNumber == oldNum;

    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        System.out.println("Pow of " + num1 + " is " + num2 + " = " + result);
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0){
            digits ++ ;
            num /= 10;
        }
        return digits;
    }
}
