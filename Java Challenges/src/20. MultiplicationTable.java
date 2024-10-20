import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Please Enter no. ");
        int b = a.nextInt();
        printmultiplicationtable(b);
        printmultiplicationtableusingforloop(b);
    }

    public static void printmultiplicationtable(int b) {
        int i = 1;
        while (i <= 10){
            System.out.println( b+ " X " + i + " = " + (b*i) );
            i++;
        }
    }

    public static void printmultiplicationtableusingforloop(int b) {
       for(int i=1; i <= 10; i++){
            System.out.println( b+ " X " + i + " = " + (b*i));
       }

    }
}

