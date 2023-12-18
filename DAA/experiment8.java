// To implement matrix multiplication and analyse its time complexity.
// time complexity: O(n^3)
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
            {2, 3, 4},
            {5, 6, 7}
        };

        int[][] matrixB = {
            {8, 9},
            {10, 11},
            {12, 13}
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        System.out.println("\nMatrix A * B:");
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}