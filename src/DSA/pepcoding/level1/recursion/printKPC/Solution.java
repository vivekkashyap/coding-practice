package DSA.pepcoding.level1.recursion.printKPC;

public class Solution {

    static String[] numCode = new String[]{".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        printKPC("78", "");
    }

    private static void printKPC(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String keyStr = numCode[ch - '0'];
        for (int i = 0; i < keyStr.length(); i++) {
            char chCode = keyStr.charAt(i);
            printKPC(str.substring(1), asf + chCode);
        }
    }
}
