package DSA.pepcoding.level1.recursion.printSubSeq;

public class Solution {
    public static void main(String[] args) {
        printSS("abc", "");
    }

//    Subsequence formula - 2^n -1
    private static void printSS(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        printSS(str.substring(1), ans + ch);
        printSS(str.substring(1), ans);
    }
}
