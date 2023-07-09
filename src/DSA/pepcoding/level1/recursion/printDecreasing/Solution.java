package DSA.pepcoding.level1.recursion.printDecreasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        printDecreasing(n);
    }

    static void printDecreasing(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}
