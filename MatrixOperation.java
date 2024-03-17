import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of columns of the matrix:");
        int cols = sc.nextInt();

        System.out.println("Enter the number of rows of the matrix:");
        int rows = sc.nextInt();

        int[][] matrix = new int[cols][rows];
        int[][] matrix2 = new int[cols][rows];

        System.out.println("Enter the elements of the first matrix:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Enter element at position [" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Enter element at position [" + i + "][" + j + "]:");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        for (int i = 0; i < cols; i++) {
            System.out.println();
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }

        System.out.println();

        System.out.println("Matrix 2:");
        for (int i = 0; i < cols; i++) {
            System.out.println();
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
        }

        System.out.println();

        sc.close();
    }
}
