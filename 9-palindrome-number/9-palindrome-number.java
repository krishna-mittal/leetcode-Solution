class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        
        int digit = 0;
        while(x > digit)
        {
            // System.out.println(digit);
            digit = digit * 10 + x % 10;
            // System.out.println(digit);
            x /= 10;
        }
        // System.out.println(x);
        
        return (x == digit || x == (digit / 10));
    }
}