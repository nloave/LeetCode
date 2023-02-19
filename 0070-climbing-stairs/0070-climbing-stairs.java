class Solution {
    int[] dp = new int[100];
    public int climbStairs(int n) {

        if (n == 1 || n == 2)
            return n;
        else if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
            return dp[n];
        }
    }
}
