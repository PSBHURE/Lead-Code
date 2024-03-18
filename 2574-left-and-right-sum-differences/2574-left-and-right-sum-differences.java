class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        int[] check=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
            }
            rightSum[i]=sum;
        }
        for(int k=0;k<nums.length;k++)
        {
            int sum=0;
            for(int l=0;l<k;l++)
            {
                if(k==0&&l==0)
                leftSum[k]=0;
                else
                {
                    sum+=nums[l];
                }
            }
            leftSum[k]=sum;
        }
        for(int m=0;m<nums.length;m++)
        {
            check[m]=Math.abs(leftSum[m]-rightSum[m]);
        }
        return check;
    }
}