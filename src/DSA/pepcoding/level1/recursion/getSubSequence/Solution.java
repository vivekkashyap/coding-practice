package DSA.pepcoding.level1.recursion.getSubSequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(gss("abc"));
        System.out.println(gss1("abc"));
    }

    private static ArrayList<String> gss(String str) {
        if(str.length() == 0) {
            return new ArrayList<>(Arrays.asList(""));
        }
        char ch = str.charAt(0);
        String remStr = str.substring(1);
        ArrayList<String> recRes = gss(remStr);
        ArrayList<String> finalSubString = new ArrayList<>();
        for (String i: recRes) {
            finalSubString.add(i);
        }
        for (String i: recRes) {
            finalSubString.add(ch + i);
        }
        return finalSubString;
    }

    private static ArrayList<String> gss1(String str) {
        if(str.length() == 0) {
            return new ArrayList<>(Arrays.asList(""));
        }
        char ch = str.charAt(0);
        ArrayList<String> subSeq = gss1(str.substring(1));
        ArrayList<String> totalSeq = new ArrayList<>(subSeq);
        for (String s: subSeq) {
            totalSeq.add(ch + s);
        }
        return totalSeq;
    }


















}
