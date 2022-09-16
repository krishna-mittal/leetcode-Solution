class Solution {
    public int tribonacci(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        int x = 0;
        if(n == 0)
            return 0;
        if(n < 3)
            return 1;
        else
            x = answer(n, arr);
        return x;
    }
    public int answer(int n, int[] arr)
    {
        if(arr[n] != -1)
            return arr[n];
        if(n == 0)
            return 0;
        if(n < 3)
            return 1;
        else
            arr[n] = answer(n-1,arr) +  answer(n-2, arr) + answer(n-3, arr);
        return arr[n];
    }
}