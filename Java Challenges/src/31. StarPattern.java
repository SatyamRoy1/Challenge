import java.util.Scanner;

class StarPattern {
    public static void main(String[] args) {
        int k = input();
        p1(k);
        p2(k);
        p3(k);

    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. ");

        return input.nextInt();

    }

    public static void p1(int k) {
        int i = 0;
        while (k > i){
            System.out.print("* ");
            int j = 0;
          while (i > j){
              System.out.print("* ");
              j++;
          }
            System.out.println();
          i++;
        }

    }

    public static void p2(int k) {
        System.out.println("\n");
        int i = k;
        while (i > 0){
            System.out.print("* ");
            int j = 0;
            while (j < i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

    }

    public static void p3(int k) {
        int r = k;
        while (r > 0){
            //This loops prints spaces
            int j = 0;
            while (j < r -1){
                System.out.print("  ");
                j++;
            }
            //this loop prints stars
            int i = 0;
            while (i <= (k - r)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            r--;
        }

    }
}
