package DSA.pepcoding.level1.recursion.allIndex;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(Arrays.toString(allIndices(arr, x, 0, 0)));
    }

    private static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(arr, x, idx, res);
        return res.stream().mapToInt(i -> i).toArray();
    }

    private static void helper(int[] arr, int x, int idx, ArrayList<Integer> res) {
        if(idx == arr.length)
            return;
        if(arr[idx] == x) {
            res.add(idx);
        }
        helper(arr, x, idx+1, res);
    }
}
