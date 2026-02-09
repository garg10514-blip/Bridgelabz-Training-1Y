import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar Age and Height: ");
        int ageA = sc.nextInt();
        int heightA = sc.nextInt();

        System.out.print("Enter Akbar Age and Height: ");
        int ageB = sc.nextInt();
        int heightB = sc.nextInt();

        System.out.print("Enter Anthony Age and Height: ");
        int ageC = sc.nextInt();
        int heightC = sc.nextInt();

        // Find Youngest
        if (ageA <= ageB && ageA <= ageC) {
            System.out.println("Youngest Friend: Amar");
        } else if (ageB <= ageA && ageB <= ageC) {
            System.out.println("Youngest Friend: Akbar");
        } else {
            System.out.println("Youngest Friend: Anthony");
        }

        // Find Tallest
        if (heightA >= heightB && heightA >= heightC) {
            System.out.println("Tallest Friend: Amar");
        } else if (heightB >= heightA && heightB >= heightC) {
            System.out.println("Tallest Friend: Akbar");
        } else {
            System.out.println("Tallest Friend: Anthony");
        }
    }
}
