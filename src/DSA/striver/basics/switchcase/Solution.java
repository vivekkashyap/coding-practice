/* https://www.codingninjas.com/studio/problems/switch-case-statement_8357244 */

package DSA.striver.basics.switchcase;

public class Solution {
    public static void main(String[] args) {
        System.out.println(areaSwitchCase(2, new double[]{3,2}));
        System.out.println(areaSwitchCase(1, new double[]{3}));
    }

    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch (ch) {
            case 1:
                return Math.PI * Math.pow(a[0], 2);
            case 2:
                return a[0] * a[1];
            default:
                return 0;
        }
    }
}