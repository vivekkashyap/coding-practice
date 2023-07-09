package DSA.pepcoding.level1.recursion.nQueens;

public class Solution {

    public static void main(String[] args) {
        int n = 4;
        printNQueens(new int[4][4], "", 0);
    }

    private static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        for (int col = 0; col < chess[0].length; col++) {
            if(chess[row][col] == 0 && isQueenSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isQueenSafe(int[][] chess, int row, int col) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(chess[i][j] == 1)
                return false;
        }
        for (int i = row - 1, j = col; i >= 0; i--) {
            if(chess[i][j] == 1)
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if(chess[i][j] == 1)
                return false;
        }
        for (int i = row, j = col - 1; j >= 0; j--) {
            if(chess[i][j] == 1)
                return false;
        }
        return true;
    }
}
