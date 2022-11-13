class Solution {
    public void setZeroes(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        
        int arr1[] = new int[a];
        int arr2[] = new int[b];
        
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                if(matrix[i][j] == 0)
                {
                    arr1[i] = 0;
                    arr2[j] = 0;
                }
            }
        }
        
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                if(arr1[i] == 0 || arr2[j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}