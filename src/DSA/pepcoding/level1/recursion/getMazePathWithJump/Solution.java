package DSA.pepcoding.level1.recursion.getMazePathWithJump;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> mazePaths = getMazePaths(1, 1, 3, 3);
        ArrayList<String> mazePaths1 = getMazePaths1(1, 1, 3, 3);
        System.out.println(mazePaths);
        System.out.println(mazePaths1);
        System.out.println("Size -> " + mazePaths.size() + " " + mazePaths1.size());
    }

    private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc)
            return new ArrayList<>(Arrays.asList(""));
        else if(sr > dr || sc > dc)
            return new ArrayList<>();
        ArrayList<String> totalPath = new ArrayList<>();
        for (int hm = 1; hm <= dc - sc; hm++) {
            ArrayList<String> hPath = getMazePaths(sr, sc + hm, dr, dc);
            for(String hp: hPath)
                totalPath.add("h" + hm + hp);
        }
        for (int vm = 1; vm <= dr - sr; vm++) {
            ArrayList<String> vPath = getMazePaths(sr + vm, sc, dr, dc);
            for(String vp: vPath)
                totalPath.add("v" + vm + vp);
        }
        for (int dm = 1; dm <= dr - sr && dm <= dc - sc; dm++) {
            ArrayList<String> dPath = getMazePaths(sr + dm, sc + dm, dr, dc);
            for(String dp: dPath)
                totalPath.add("d" + dm + dp);
        }
        return totalPath;
    }


    private static ArrayList<String> getMazePaths1(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc)
            return new ArrayList<>();
        if(sr == dr && sc == dc)
            return new ArrayList<>(List.of(""));
        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPath = new ArrayList<>();
        ArrayList<String> diagonalPath = new ArrayList<>();
        ArrayList<String> finalResult = new ArrayList<>();
        for (int i = 1; i <= dc - sc; i++) {
            horizontalPath = getMazePaths1(sr, sc+i, dr, dc);
            for (String s : horizontalPath)
                finalResult.add("h" + i + s);
        }
        for (int i = 1; i <= dr - sr; i++) {
            verticalPath = getMazePaths1(sr+i, sc, dr, dc);
            for (String s : verticalPath)
                finalResult.add("v" + i + s);
        }
        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            diagonalPath = getMazePaths1(sr+i, sc+i, dr, dc);
            for (String s : diagonalPath)
                finalResult.add("d" + i + s);
        }
        return finalResult;
    }
}
