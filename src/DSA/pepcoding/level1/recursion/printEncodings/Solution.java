package DSA.pepcoding.level1.recursion.printEncodings;

public class Solution {
    public static void main(String[] args) {
        printEncodings("655196");
    }

    private static void printEncodings(String str) {
        helper1(str, "");
    }

    private static void helper(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        } else if(str.length() == 1) {
            char ch = str.charAt(0);
            if(ch == '0')
                return;
            else {
                int chv = ch - '0';
                char code = (char) (chv + 'a' - 1);
                asf += code;
                System.out.println(asf);
            }
        } else {
            char ch = str.charAt(0);
            String remStr = str.substring(1);
            if(ch == '0')
                return;
            else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                helper(remStr, asf + code);
            }
            String twoChar = str.substring(0, 2);
            String remTwoStr = str.substring(2);

            int parseInt = Integer.parseInt(twoChar);
            if(parseInt <= 26) {
                char code = (char) ('a' + parseInt - 1);
                helper(remTwoStr, asf + code);
            }
        }
    }

    private static void helper1(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        } else if(str.length() == 1) {
            char ch = str.charAt(0);
            if(ch != '0') {
                int chInt = ch - '0';
                char code = (char) ('a' + chInt - 1);
                asf += code;
                System.out.println(asf);
            }
        } else {
            char ch = str.charAt(0);
            String remStr = str.substring(1);
            if(ch  != '0') {
                int chInt = ch - '0';
                char code = (char) ('a' + chInt - 1);
                helper1(remStr, asf + code);
            }
            String ch12 = str.substring(0, 2);
            String remStr12 = str.substring(2);
            int parse12 = Integer.parseInt(ch12);
            if(parse12 <= 26) {
                char code = (char) ('a' + parse12 - 1);
                helper1(remStr12, asf + code);
            }
        }
    }
}
