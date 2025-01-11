public class BShapePattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the B shape

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows / 2; j++) {
                // Conditions to print '*'
                if (j == 0 || // Left vertical line of B
                    (i == 0 && j != rows / 2) || // Top horizontal line
                    (i == rows / 2 && j != rows / 2) || // Middle horizontal line
                    (i == rows - 1 && j != rows / 2) || // Bottom horizontal line
                    (j == rows / 2 && i != 0 && i != rows / 2 && i != rows - 1)) { // Right vertical lines
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
