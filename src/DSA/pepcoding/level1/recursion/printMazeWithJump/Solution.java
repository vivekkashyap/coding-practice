package DSA.pepcoding.level1.recursion.printMazeWithJump;

public class Solution {
    public static void main(String[] args) {
        printMazePaths(1, 1, 3, 3, "");
    }

    private static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr > dr || sc > dc)
            return;
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        for (int i = 1; i <= dr - sr; i++) {
            printMazePaths(sr + i, sc, dr, dc, psf + "h" + i);
        }
        for (int i = 1; i <= dc - sc; i++) {
            printMazePaths(sr, sc + i, dr, dc, psf + "v" + i);
        }
        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
        }
    }
}
