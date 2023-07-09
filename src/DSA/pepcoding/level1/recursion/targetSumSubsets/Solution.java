package DSA.pepcoding.level1.recursion.targetSumSubsets;

public class Solution {
    public static void main(String[] args) {
        printTargetSumSubsets(new int[] {10, 20, 30, 40, 50}, 0, "", 0 , 60);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    private static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx == arr.length) {
            if(sos == tar)
                System.out.println(set + ".");
            return;
        }
        printTargetSumSubsets(arr, idx+1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set, sos, tar);
    }

}
