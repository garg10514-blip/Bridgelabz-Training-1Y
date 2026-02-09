import java.util.Scanner;

class LeapYearIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar)");
        } 
        else {
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            }
            else if (year % 100 == 0) {
                System.out.println("Year is NOT a Leap Year");
            }
            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            }
            else {
                System.out.println("Year is NOT a Leap Year");
            }
        }
    }
}
