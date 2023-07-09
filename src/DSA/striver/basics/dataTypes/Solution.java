package DSA.striver.basics.dataTypes;

public class Solution {
    public static void main(String[] args) {
        System.out.println(dataTypes("Integer"));
        System.out.println(dataTypes("Long"));
        System.out.println(dataTypes("Float"));
        System.out.println(dataTypes("Double"));
        System.out.println(dataTypes("Character"));
    }

    public static int dataTypes(String type) {
        // Write your code here
        switch (type) {
            case "Integer":
                return Integer.SIZE/8;
            case "Long":
                return Long.SIZE/8;
            case "Float":
                return Float.SIZE/8;
            case "Double":
                return Double.SIZE/8;
            case "Character":
                return 1;
            default:
                return 0;
        }
    }
}


/* https://www.codingninjas.com/studio/problems/data-type_8357232 */