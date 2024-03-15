import java.util.Scanner;
public class Triangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the height of the triangle: ");
            int n = scanner.nextInt();
            displayTriangle(n);

            scanner.close();
        }
        private static void displayTriangle(int height) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                System.out.println();

            }
            System.exit(0);
        }
    }
