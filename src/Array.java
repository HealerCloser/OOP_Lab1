import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array with the given size
        int[] array = new int[size];

        // Input values for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate sum
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / size;

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Print sum
        System.out.println("Sum of array elements: " + sum);

        // Print average
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
