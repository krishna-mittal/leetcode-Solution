class Solution {
    public int lengthOfLIS(int[] nums) {
//         int[] dp = new int[nums.length];
//         dp[0] = 1;
        
//         int ans  = 1;
//         for(int i = 1; i < nums.length; i++)
//         {
//             int max = 0;
//             for(int j = 0; j < i; j++)
//             {
//                 if(nums[i] > nums[j])
//                     max = Math.max(max, dp[j]);
//                 dp[i] = max + 1;
//                 ans = Math.max(ans, dp[i]);
//             }
//         }
//         return ans;
        
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int len = 1;
        
        for(int i = 1; i < nums.length; i++)
        {
            if(arr[len - 1] < nums[i])
            {
                arr[len] = nums[i];
                len++;
            }
            else
            {
                int c = Indceil(arr, 0 , len - 1, nums[i]);
                arr[c] = nums[i];
            }
        }
        return len;
     }
    public int Indceil(int arr[], int r, int l, int m)
    {
        while(l > r)
        {
            int x = r + (l - r)/2;
            if(arr[x] >= m)
                l = x;
            else
                r = x + 1;
        }
        return l;
    }
}
























