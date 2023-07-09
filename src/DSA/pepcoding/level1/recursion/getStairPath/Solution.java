package DSA.pepcoding.level1.recursion.getStairPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getStairPaths(3));
        System.out.println(getStairPaths1(3));
    }

    private static ArrayList<String> getStairPaths(int n) {
        if(n == 0)
            return new ArrayList<>(Arrays.asList(""));
        else if (n < 0)
            return new ArrayList<>();
        ArrayList<String> step1 = getStairPaths(n-1);
        ArrayList<String> step2 = getStairPaths(n-2);
        ArrayList<String> step3 = getStairPaths(n-3);
        ArrayList<String> finalPath = new ArrayList<>();
        for(String i: step1) {
            finalPath.add("1" + i);
        }
        for(String i: step2) {
            finalPath.add("2" + i);
        }
        for(String i: step3) {
            finalPath.add("3" + i);
        }
        return finalPath;
    }

    private static ArrayList<String> getStairPaths1(int n) {
        if(n < 0)
            return new ArrayList<>();
        if(n == 0)
            return new ArrayList<>(List.of(""));
        ArrayList<String> step;
        ArrayList<String> finalResult = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            step = getStairPaths1(n-i);
            for(String s : step)
                finalResult.add(i + s);
        }
        return finalResult;
    }

}
