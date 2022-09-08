class Solution {
    int[] dp = new int[31];
    public int fib(int n)
    {
        if(n == 0 )
            return 0;
        if(n == 1 || n == 2)
            return 1;
        calcy(n);
        return dp[n];
    }
    public int calcy(int n)
    {
        if(dp[n] != 0)
            return dp[n];
        if(n < 3)
            return 1;
        else
            dp[n] = calcy(n - 1) + calcy(n - 2);
        return calcy(n);
    }
}