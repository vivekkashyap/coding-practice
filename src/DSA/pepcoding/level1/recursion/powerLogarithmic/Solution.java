package DSA.pepcoding.level1.recursion.powerLogarithmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        System.out.println(powerLog(x, n));
    }

    private static int powerLog(int x, int n) {
        if(n==0)
            return 1;
        int p = (n%2 == 0) ? 1 : x;
        return p * powerLog(x, n/2) * powerLog(x, n/2);
    }
}
