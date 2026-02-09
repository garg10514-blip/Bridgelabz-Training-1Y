import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Loop until number becomes 0
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Find cube of digit and add to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit
            number = number / 10;
        }

        // Compare sum with original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }
    }
}
