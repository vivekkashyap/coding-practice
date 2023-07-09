package DSA.pepcoding.level1.recursion.printIncreasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        printIncreasing(n);
    }

    static void printIncreasing(int n){
        if(n == 0)
            return;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
