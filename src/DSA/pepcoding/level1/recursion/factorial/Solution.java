package DSA.pepcoding.level1.recursion.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int fact = factorial(n);
        System.out.println(fact);
    }

    private static int factorial(int n) {
        if(n==0 || n == 1)
            return 1;
        return n * factorial(n-1);
    }

}
