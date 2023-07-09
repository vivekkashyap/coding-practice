package DSA.pepcoding.level1.recursion.removeOppositeNumber;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(makeBeautiful(new int[]{-3, -1, -19, 0, 6, -13, 12}));
        System.out.println(makeBeautiful2(new int[]{-3, -1, -19, 0, 6, -13, 12}));

        System.out.println(makeBeautiful(new int[]{}));
        System.out.println(makeBeautiful2(new int[]{}));

        System.out.println(makeBeautiful(new int[]{4, 2, -2, 1}));
        System.out.println(makeBeautiful2(new int[]{4, 2, -2, 1}));

        System.out.println(makeBeautiful(new int[]{2, -2, 1, -1}));
        System.out.println(makeBeautiful2(new int[]{2, -2, 1, -1}));
    }

    private static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        makeBeautifulHelper(result, 0);
        return result;
    }

    private static void makeBeautifulHelper(ArrayList<Integer> result, int i) {
        if (result.size() == 0 || result.size() == 1 || i == result.size() - 1)
            return;
        if (result.get(i) < 0 && result.get(i + 1) >= 0 || result.get(i) >= 0 && result.get(i + 1) < 0) {
            result.remove(i + 1);
            result.remove(i);
            makeBeautifulHelper(result, 0);
        } else {
            makeBeautifulHelper(result, i + 1);
        }
    }

    private static ArrayList<Integer> makeBeautiful2(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int prev;
        int size;
        for (int i = 0; i < arr.length; i++) {
            if(result.isEmpty()){
                result.add(arr[i]);
            } else {
                size = result.size();
                prev = result.get(size-1);
                if(prev < 0 && arr[i] < 0 || prev >= 0 && arr[i] >= 0) {
                    result.add(arr[i]);
                } else {
                    result.remove(result.size()-1);
                }
            }
        }
        return result;
    }
}
