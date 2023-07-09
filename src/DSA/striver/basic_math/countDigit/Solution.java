package DSA.striver.basic_math.countDigit;

public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int divisor = (temp%10);
            if(divisor != 0 && n % divisor == 0)
                count ++;
            temp /= 10;
        }
        return count;
    }
}

/* Link : https://www.codingninjas.com/studio/problems/count-digits_8416387 */