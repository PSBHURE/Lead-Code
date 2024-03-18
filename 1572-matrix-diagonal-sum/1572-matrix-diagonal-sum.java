class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int x=(mat[i].length-1)-i;
               if(i==j || j==x)
                    sum+=mat[i][j];
               // if()
                   // sum+=mat[i][j];
            }
        }
        return sum;
    }
}