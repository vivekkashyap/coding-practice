package DSA.pepcoding.level1.dp.fibonacciDP;

public class Solution {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(getFibonacciDP(n));
    }

    private static int getFibonacciDP(int n) {
        if (n == 0 || n == 1)
            return n;
        int f1 = 0;
        int f2 = 1;
        int result = f1 + f2;
        for (int i = 0; i < n - 2; i++) {
            f1 = result;
            result += f2;
            f2 = f1;
        }
        return result;
    }
}
