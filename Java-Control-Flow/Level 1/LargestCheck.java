import java.util.Scanner;

class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c){
            System.out.println("first number the largest ");
        }

        if (b > a && b > c){
            System.out.println("second number the largest ");
        }

        else{
            System.out.println("third number the largest");
        }
    }
}
