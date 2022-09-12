class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        int[][] check = new int[m+1][n+1];
        for(int[] i : check)
        {
            Arrays.fill(i,-1);
        }
        
        return longestStr(text1, text2, text1.length(), text2.length(), check);
    }
    public int longestStr(String s1,String s2, int m, int n, int[][] check)
    {
        if(check[m][n] != -1)
            return check[m][n];
        if(m == 0 || n == 0)
            return check[m][n] = 0;
        else
        {
            if(s1.charAt(m-1) == s2.charAt(n-1))
                check[m][n] = 1 + longestStr(s1, s2, m-1, n-1, check);
            else
                check[m][n] = Math.max(longestStr(s1, s2, m-1, n, check),longestStr(s1, s2, m, n-1, check));
        }
        return check[m][n];
    }
}