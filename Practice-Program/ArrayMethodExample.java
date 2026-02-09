import java.util.Scanner;
import java.util.Arrays;

class ArrayMethodExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaration and initialization of array
        int[] arr = {40, 10, 30, 20};

        // 1. Printing array
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        // 2. Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));

        // 3. Binary search
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30 : " + index);

        // 4. Comparing two arrays
        int[] arr2 = {10, 20, 30, 40};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println("Both arrays are equal: " + isEqual);

        // 5. Filling array with same value
        int[] arr3 = new int[5]; // size 5
        Arrays.fill(arr3, 7);
        System.out.println("Filled Array");
        System.out.println(Arrays.toString(arr3));
    }
}
