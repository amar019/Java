public class AShapePattern {
    public static void main(String[] args) {
        int rows = 7; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows; j++) {
                // Print '*' for the borders of 'A' and the middle line
                if (j == 0 || j == rows || (i == rows / 2 && j > 0 && j < rows)) {
                    System.out.print("*");
                } else if (i > 0 && j < rows) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
