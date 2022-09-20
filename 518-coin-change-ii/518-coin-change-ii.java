class Solution {
    public int change(int amount, int[] coins) {
        int[] comb = new int[amount + 1];
        comb[0] = 1;
        for(int i : coins)
        {
            for(int j = i; j < comb.length; j++)
            {
                comb[j] += comb[j - i];
            }
        }
        return comb[amount];
    }
        
}