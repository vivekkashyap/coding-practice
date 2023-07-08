package DSA.pepcoding.level2;

/* LeetCode Link: https://leetcode.com/problems/long-pressed-name/description/ */

public class FaultyKeyboard {
    public static void main(String[] args) {
        FaultyKeyboard f = new FaultyKeyboard();
        System.out.println(f.isLongPressedName("alex", "aaleex"));
        System.out.println(f.isLongPressedName("saeed", "ssaaedd"));
    }

    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else {
                return false;
            }
        }
        while (j < typed.length()) {
            if (name.charAt(i - 1) != typed.charAt(j))
                return false;
            j++;
        }
        return (i < name.length()) ? false : true;
    }

}
