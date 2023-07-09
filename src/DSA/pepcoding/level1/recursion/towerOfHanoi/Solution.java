package DSA.pepcoding.level1.recursion.towerOfHanoi;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        towerOfHanoi(n, n1, n2, n3);
    }

    private static void towerOfHanoi(int n, int t1, int t2, int t3){
        if(n==0)
            return;
        towerOfHanoi(n-1, t1, t3, t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        towerOfHanoi(n-1, t3, t2, t1);
    }
}
