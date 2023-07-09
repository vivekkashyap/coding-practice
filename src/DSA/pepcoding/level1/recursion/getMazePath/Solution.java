package DSA.pepcoding.level1.recursion.getMazePath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMazePaths(1, 1, 3, 3));
        System.out.println(getMazePaths1(1, 1, 3, 3));
    }

    private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc)
            return new ArrayList<>(Arrays.asList(""));
        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();
        if(sr < dr)
            horizontalPath = getMazePaths(sr+1, sc, dr, dc);
        if(sc < dc)
            verticalPath = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> finalResult = new ArrayList<>();
        for (String path: horizontalPath) {
            finalResult.add("h" + path);
        }
        for (String path: verticalPath) {
            finalResult.add("v" + path);
        }
        return finalResult;
    }


    private static ArrayList<String> getMazePaths1(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            return new ArrayList<>(List.of(""));
        }
        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();
        if (sr < dr)
            verticalPath = getMazePaths1(sr+1, sc, dr, dc);
        if(sc < dc)
            horizontalPath = getMazePaths1(sr, sc+1, dr, dc);
        ArrayList<String> finalResult = new ArrayList<>();
        for (String s: horizontalPath)
            finalResult.add("h" + s);
        for (String s: verticalPath)
            finalResult.add("v" + s);
        return finalResult;
    }
}
