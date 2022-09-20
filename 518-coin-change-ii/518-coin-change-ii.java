class Solution {
    public int change(int amount, int[] coins) {
        // int[] comb = new int[amount+1];
        // comb[0] = 1;
        // for(int i=0;i<coins.length;i++)
        // {
        //     for(int j=coins[i];j < comb.length;j++)
        //     {
        //             comb[j] += comb[j - coins[i]];
        //     }
        // }
        // return comb[amount];
        
        // return ways(amount, coins, coins.length);
        
        int[][] dp = new int[amount + 1][coins.length + 1];
        
        for(int i = 0; i < coins.length + 1; i++)
        {
            dp[0][i] = 1;
        }
        
        for(int i = 1; i < amount + 1; i++)
        {
            dp[i][0] = 0; 
            
        }
        for(int i = 1; i < amount + 1; i++)
        {
            for(int j = 1; j < coins.length + 1; j++)
            {
                dp[i][j] = dp[i][j - 1];
                
                if(i >= coins[j - 1])
                    dp[i][j] += dp[i - coins[j - 1]][j];
            }
        }
        return dp[amount][coins.length];
        
    }
//     public int ways(int amount, int[] coins, int n)
//     {
//         if(amount == 0)
//             return 1;
//         if(n == 0)
//             return 0;
//         int res = ways(amount, coins, n - 1);
        
//         if(coins[n - 1] <= amount)
//             res = res + ways(amount - coins[n - 1], coins, n);
//         return res;
//     }
}