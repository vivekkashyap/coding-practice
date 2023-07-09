package DSA.striver.basic_math.reverseNumber;

/* https://www.codingninjas.com/studio/problems/reverse-bits_2181102 */

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(reverseBits(0));
        System.out.println(reverseBits(12));
        System.out.println(reverseBits(6));
        System.out.println(reverseBits(4));
    }

    public static long reverseBits(long n) {
        // Write your code here
        long revNum = 0;
        for (int i = 0; i < 32; i++) {
            revNum <<= 1; // shifting of 1 bit to left
            if ((n & 1) == 1) {
                revNum ^= 1; // Set the rightmost bit of result to 1
            }
            n >>= 1;
        }
        return revNum;
    }
}
