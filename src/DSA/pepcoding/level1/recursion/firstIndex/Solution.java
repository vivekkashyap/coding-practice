package DSA.pepcoding.level1.recursion.firstIndex;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(arr, 0, x));

    }

    private static int firstIndex(int[] arr, int idx, int x) {
        if(idx == arr.length)
            return -1;
        if(arr[idx] == x)
            return idx;
        else
            return firstIndex(arr, idx+1, x);
    }
}
