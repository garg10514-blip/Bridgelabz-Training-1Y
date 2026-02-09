import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power: ");
        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result: " + result);
    }
}
