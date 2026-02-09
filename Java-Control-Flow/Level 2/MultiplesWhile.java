import java.util.Scanner;

class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (<100): ");
        int number = sc.nextInt();

        int counter = 100;
        while (counter > 0) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
    }
}
