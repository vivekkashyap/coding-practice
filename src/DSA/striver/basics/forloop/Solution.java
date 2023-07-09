package DSA.striver.basics.forloop;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthFibonacciNumber(n));
        /*
        System.out.println(nthFibonacciNumber(6));
        System.out.println(nthFibonacciNumber(1));
        System.out.println(nthFibonacciNumber(3));
        */
    }

    private static int nthFibonacciNumber(int n) {
        if(n == 1 || n == 2)
            return 1;
        int n1 = 1;
        int n2 = 1;
        int fn = 0;
        for (int i = 2; i < n; i++) {
            fn = n1 + n2;
            n1 = n2;
            n2 = fn;

        }
        return fn;
    }
}

/* https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156 */