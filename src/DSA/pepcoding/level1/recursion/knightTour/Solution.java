package DSA.pepcoding.level1.recursion.knightTour;

public class Solution {

    public static void main(String[] args) {
        int n = 5;
//        starting position of knight
        int row = 2, col = 0;
        printKnightsTour(new int[5][5], row, col, 1);
    }

    private static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0)
            return;
        else if(upcomingMove == chess.length * chess.length) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;
        printKnightsTour(chess, r-2, c+1, upcomingMove + 1);
        printKnightsTour(chess, r-1, c+2, upcomingMove + 1);
        printKnightsTour(chess, r+1, c+2, upcomingMove + 1);
        printKnightsTour(chess, r+2, c+1, upcomingMove + 1);
        printKnightsTour(chess, r+2, c-1, upcomingMove + 1);
        printKnightsTour(chess, r+1, c-2, upcomingMove + 1);
        printKnightsTour(chess, r-1, c-2, upcomingMove + 1);
        printKnightsTour(chess, r-2, c-1, upcomingMove + 1);
        chess[r][c] = 0;
    }

    private static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}