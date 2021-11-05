
/*
You have d dice and each die has f faces numbered 1, 2, ..., f. You are given three integers d, f, and target.

Return the number of possible ways (out of fd total ways) modulo 109 + 7 to roll the dice so the sum of the face-up numbers equals target.

Example 2:

Input: d = 2, f = 6, target = 7
Output: 6
Explanation: 
You throw two dice, each with 6 faces.  There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.

*/


import java.util.Arrays;

public class DiceProblem {
	
	static int[][] dp;
	static int mod=1000000007;
	
	public static void main(String[] args) {
		int d = 1, f = 6, target = 6;
		int noOfWay = numRollsToTarget(d, f, target);
		System.out.println(noOfWay);
	}
	
    public static int numRollsToTarget(int d, int f, int target) {
        dp=new int[d+1][target+1];
        for(int i=0;i<=d;i++) Arrays.fill(dp[i],-1);
        return solve(d,f,target);
    }
    public static int solve(int d,int f,int target){
        if(target<d) return 0;
        if(target==d) return 1;
        if(d==0) return 0;
        if(dp[d][target]!=-1) return dp[d][target];
        int ans=0;
        for(int i=1;i<=f;i++){
            ans=(ans+solve(d-1,f,target-i))%mod;
        }
        dp[d][target]=ans;
        return ans;
    }
}
