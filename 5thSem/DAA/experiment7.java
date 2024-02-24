// To implement n queen's problem using backtracking analysis time complexity.
// time complexity: O(n!)

public class NQueens {
    public static void solveNQueens(int n) {
        int[] queensPlacement = new int[n];
        placeQueens(queensPlacement, 0, n);
    }

    private static void placeQueens(int[] queensPlacement, int row, int n) {
        if (row == n) {
            printQueensPlacement(queensPlacement);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(queensPlacement, row, col)) {
                queensPlacement[row] = col;
                placeQueens(queensPlacement, row + 1, n);
            }
        }
    }

    private static boolean isSafe(int[] queensPlacement, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queensPlacement[prevRow];

            if (prevCol == col || // Check if two queens share the same column
                Math.abs(prevRow - row) == Math.abs(prevCol - col)) { // Check if two queens are on the same diagonal
                return false;
            }
        }

        return true;
    }

    private static void printQueensPlacement(int[] queensPlacement) {
        int n = queensPlacement.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (queensPlacement[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8; // Change this to the desired board size (e.g., 4, 8, 12, ...)
        solveNQueens(n);
    }
}

    public static void solveNQueens(int n) {
        int[] queensPlacement = new int[n];
        placeQueens(queensPlacement, 0, n);
    }

    private static void placeQueens(int[] queensPlacement, int row, int n) {
        if (row == n) {
            printQueensPlacement(queensPlacement);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(queensPlacement, row, col)) {
                queensPlacement[row] = col;
                placeQueens(queensPlacement, row + 1, n);
            }
        }
    }

    private static boolean isSafe(int[] queensPlacement, int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queensPlacement[prevRow];

            if (prevCol == col || // Check if two queens share the same column
                Math.abs(prevRow - row) == Math.abs(prevCol - col)) { // Check if two queens are on the same diagonal
                return false;
            }
        }

        return true;
    }

    private static void printQueensPlacement(int[] queensPlacement) {
        int n = queensPlacement.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (queensPlacement[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8; // Change this to the desired board size (e.g., 4, 8, 12, ...)
        solveNQueens(n);
    }
}
