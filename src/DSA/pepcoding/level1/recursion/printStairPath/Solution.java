package DSA.pepcoding.level1.recursion.printStairPath;

public class Solution {
    public static void main(String[] args) {
        printStairPaths(3, "");
    }

    private static void printStairPaths(int n, String path) {
        if(n <= 0) {
            if(n == 0)
                System.out.println(path);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            printStairPaths(n-i, path + i);
        }
    }

}
