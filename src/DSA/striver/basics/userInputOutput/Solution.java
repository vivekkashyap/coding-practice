package DSA.striver.basics.userInputOutput;

/* Link: https://www.codingninjas.com/studio/problems/find-character-case_58513 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(characterCase(ch));
    }

    private static int characterCase(char ch) {
        int charInt = ch;
        if(charInt >= (int)'A' && charInt <= 'Z')
            return 1;
        if(charInt >= (int)'a' && charInt <= 'z')
            return 0;
        return -1;
    }
}