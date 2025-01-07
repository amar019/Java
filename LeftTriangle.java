import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int k = rows - 1; k >= i; k--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        sc.close(); // Close the Scanner to prevent resource leaks
    }
}
