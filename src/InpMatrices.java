import java.util.Scanner;

public class InpMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create matrices
        int[][] matrix1 = new

                int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input values for matrix1
        System.out.println("Enter the elements for the first matrix:");
        inputMatrixValues(scanner, matrix1);

        // Input values for matrix2
        System.out.println("Enter the elements for the second matrix:");
        inputMatrixValues(scanner, matrix2);

        // Add matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Print the result matrix
        System.out.println("Resultant Matrix after Addition:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    // Method to input values for a matrix
    private static void inputMatrixValues(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
