package DSA.pepcoding.level1.recursion.maxOfArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, n));
    }

    private static int maxOfArray(int[] arr, int idx) {
        if(idx == 0)
            return 0;
        return Math.max(arr[idx-1], maxOfArray(arr, idx-1));
    }
}
