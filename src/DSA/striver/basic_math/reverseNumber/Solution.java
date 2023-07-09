package DSA.striver.basic_math.reverseNumber;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(123));
        System.out.println(s.reverse(-123));
        System.out.println(s.reverse(120));
        System.out.println(s.reverse(1534236469));
    }

    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) {
            isNegative = true;
            x = -x;
        }

        long rev = 0;

        while(x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        if(rev > Integer.MAX_VALUE)
            return 0;

        return (int) ((isNegative) ? -rev : rev);
    }
}

/* https://leetcode.com/problems/reverse-integer/submissions/990414825/ */
