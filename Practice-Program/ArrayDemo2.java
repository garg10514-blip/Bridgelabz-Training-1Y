import java.util.Scanner;

class ArrayDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 15, 20};

        //---Display array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array inputs at index " + i + " : " + arr[i]);
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at index : " + i);
                found = true;
                break;         //----stop after first match
            }
        }

        if (!found) {
            System.out.println("Element not found in array");
        }
    }
}
