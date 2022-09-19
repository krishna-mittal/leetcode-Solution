class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }
        int a = 0;
        int y = 0;
        int z = x;
        
        while(x != 0)
        {
            y = x%10;
            a = a * 10 + y;
            x = x / 10 ;
        }
        if(a == z)
        {
            return true;
        }
        return false;
    }
}