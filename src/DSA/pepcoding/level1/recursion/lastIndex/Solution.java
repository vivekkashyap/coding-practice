package DSA.pepcoding.level1.recursion.lastIndex;

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
        System.out.println(lastIndex(arr, 0, x));

    }

    private static int lastIndex(int[] arr, int idx, int x) {
        int li = -1;
        if(idx == arr.length)
            return li;
        if(arr[idx] == x)
            li = idx;
        return Math.max(li, lastIndex(arr, idx+1, x));
    }
}
