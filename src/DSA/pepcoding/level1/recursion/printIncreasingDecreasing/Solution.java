package DSA.pepcoding.level1.recursion.printIncreasingDecreasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        pdi(n);
    }

    private static void pdi(int n) {
        if(n==0)
            return;;
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
