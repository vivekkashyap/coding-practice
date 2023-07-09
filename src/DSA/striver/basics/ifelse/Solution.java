package DSA.striver.basics.ifelse;

public class Solution {
    public static void main(String[] args) {
        System.out.println(compareIfElse(5, 3));
        System.out.println(compareIfElse(2, 2));
    }

    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a > b)
            return "greater";
        else if(a < b)
            return "smaller";
        else
            return "equal";
    }
}

/* https://www.codingninjas.com/studio/problems/if-else-decision-making_8357235 */