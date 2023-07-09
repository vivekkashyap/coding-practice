package DSA.pepcoding.level1.recursion.floodFill;

import java.util.Scanner;

public class Solution {

    /*
    3 3
    0 0 0
    1 0 1
    0 0 0
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    private static void floodfill(int[][] maze, int sr, int sc, String asf) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        floodfillHelper(maze, sr, sc, asf, visited);
    }

    private static void floodfillHelper(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {
        if(sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc])
            return;
        if(sr == maze.length -1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }
        visited[sr][sc] = true;
        floodfillHelper(maze, sr-1, sc, asf + "t", visited);
        floodfillHelper(maze, sr, sc-1, asf + "l", visited);
        floodfillHelper(maze, sr+1, sc, asf + "d", visited);
        floodfillHelper(maze, sr, sc+1, asf + "r", visited);
        visited[sr][sc] = false;
    }
}
