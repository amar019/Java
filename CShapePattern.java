public class CShapePattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the C shape

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows / 2; j++) {
                // Conditions to print '*'
                if (i == 0 && j != 0 || // Top horizontal line
                    i == rows - 1 && j != 0 || // Bottom horizontal line
                    j == 0 && i != 0 && i != rows - 1) { // Left vertical line
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
