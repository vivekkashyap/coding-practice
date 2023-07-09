package DSA.pepcoding.level1.recursion.printMazePath;

public class Solution {
    public static void main(String[] args) {
        printMazePaths(1, 1, 2, 2, "");
    }

    private static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        if(sr < dr)
            printMazePaths(sr+1, sc, dr, dc, psf + "h");
        if(sc < dc)
            printMazePaths(sr, sc+1, dr, dc, psf + "v");
    }
}
