package DSA.pepcoding.level1.recursion.printPermutations;

public class Solution {
    public static void main(String[] args) {
        printPermutations("abc", "");
        System.out.println("-------------------------");
        printPermutations1("abc", "");
    }

    private static void printPermutations(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String req = left + right;
            printPermutations(req, asf + ch);
        }
    }






    private static void printPermutations1(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String req = str.substring(0, i) + str.substring(i+1);
            printPermutations(req, asf + ch);
        }
    }






















}
