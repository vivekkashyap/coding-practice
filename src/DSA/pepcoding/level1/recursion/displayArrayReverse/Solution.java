package DSA.pepcoding.level1.recursion.displayArrayReverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArrReverse(arr, n);
    }

    private static void displayArrReverse(int[] arr, int idx){
        if(idx == 0)
            return;
        System.out.println(arr[idx-1]);
        displayArrReverse(arr, idx-1);
    }
}
