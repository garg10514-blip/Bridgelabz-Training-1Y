import java.util.Scanner;

class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
    }
}
