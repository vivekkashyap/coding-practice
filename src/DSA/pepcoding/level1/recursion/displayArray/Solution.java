package DSA.pepcoding.level1.recursion.displayArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArr(arr, n);
    }

    private static void displayArr(int[] arr, int idx){
        if(idx == 0)
            return;
        displayArr(arr, idx-1);
        System.out.println(arr[idx-1]);
    }
}
