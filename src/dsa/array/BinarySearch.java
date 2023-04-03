package dsa.array;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.println("Enter the size of array...");
        int n = scanner.nextInt();

        // Create an array of integers
        int[] arr = new int[n];

        // Populate the array with random numbers
        System.out.println("Enter the array like (1,2,3,4,5,)");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the array
        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Get the element to be searched
        System.out.println("\n Enter the element to search.");
        int key = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(arr, 0, n - 1, key);

        // Print the index of the element
        if (index == -1) {
            System.out.println("The element is not found in the array");
        } else {
            System.out.println("The element is found at index " + index);
        }
    }

//    The time complexity of the binary search program is O(log n),
//    where n is the number of elements in the array.
//    This is because the program divides the array in half at each step,
//    so the number of steps is proportional to the logarithm of the number of elements.

//    The space complexity of the binary search program is O(1),
//    since it only requires constant space to store the current search range and the key.

    public static int binarySearch(int[] arr, int low, int high, int key) {

        if (high >= low) {
            // Find the middle point
            int mid = (low + high) / 2;

            // Compare the key with the middle element
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return binarySearch(arr, mid + 1, high, key);
            } else {
                return binarySearch(arr, low, mid - 1, key);
            }
        } else {
            // Element is not found
            return -1;
        }
    }


}
