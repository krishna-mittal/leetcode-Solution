class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new  int[amount + 1];
        Arrays.fill(dp , amount + 1);
        dp[0] = 0;
        
        for(int i = 1; i < amount + 1; i++)
        {
            for(int j : coins)
            {
                if(i >= j)
                {
                    dp[i] = Math.min(dp[i - j] + 1, dp[i]);
                }
            }
        }
        if(dp[amount] > amount)
            return -1;
        return dp[amount];
    }
}