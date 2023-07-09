package DSA.pepcoding.level1.recursion.ZigZag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        zigzag(n);
    }

    private static void zigzag(int n) {
        if(n==0)
            return;
        System.out.print(n + " ");;
        zigzag(n-1);
        System.out.print(n + " ");
        zigzag(n-1);
        System.out.print(n + " ");
    }
}
