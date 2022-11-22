class Solution {
    public int hammingDistance(int x, int y) {
        int a = (x ^ y);
        int mask = 1;
        int count = 0;
        for(int i = 1; i <= 32; i++)
        {
            if((a & mask)!=0)
            {
                count++;
            }
            mask<<=1;
        }
        return count;
    }
}