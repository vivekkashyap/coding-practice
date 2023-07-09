package DSA.pepcoding.level1.recursion.getKPC;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    static String[] numCode = new String[]{".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        System.out.println(getKPC1("78"));
    }

    private static ArrayList<String> getKPC(String s) {
        if(s.length() == 0)
            return new ArrayList<>(Arrays.asList(""));
        char ch = s.charAt(0);
        String subStr = s.substring(1);
        ArrayList<String> tempSeq = getKPC(subStr);
        ArrayList<String> finalResult = new ArrayList<>();
        String strCode = numCode[ch - '0'];
        for (int i = 0; i < strCode.length(); i++) {
            char subNumCode = strCode.charAt(i);
            for (String val: tempSeq) {
                finalResult.add(subNumCode + val);
            }
        }
        return finalResult;
    }


//    78
    private static ArrayList<String> getKPC1(String str) {
        if(str.length() == 0) {
            return new ArrayList<>(Arrays.asList(""));
        }
        char ch = str.charAt(0);
        ArrayList<String> subKpc = getKPC1(str.substring(1));
        ArrayList<String> finalResult = new ArrayList<>();
        String strNumCode = numCode[ch - '0'];
        for (int i = 0; i < strNumCode.length(); i++) {
            char subNumCode = strNumCode.charAt(i);
            for(String s: subKpc) {
                finalResult.add(subNumCode + s);
            }
        }
        return finalResult;
    }
}
