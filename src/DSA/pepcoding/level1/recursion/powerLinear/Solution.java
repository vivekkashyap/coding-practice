package DSA.pepcoding.level1.recursion.powerLinear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        System.out.println(power(x, n));
   }

   private static int power(int x, int n){
        if(n==0)
            return 1;
        return x * power(x, n-1);
   }

}
