package DSA.striver.basics.whileloop;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfEvenOdd(n);
    }

    private static void sumOfEvenOdd(int n) {
        int evenSum = 0;
        int oddSum = 0;
        while(n > 0) {
            int digit = n % 10;
            if(digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            n /= 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}

/* https://www.codingninjas.com/studio/problems/sum-of-even-odd_624650? */
