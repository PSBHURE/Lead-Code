class Solution {
    public int sumOfSquares(int[] nums) {
        double sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length%(i+1)==0)
                sum+=Math.pow(nums[i],2);
        }
        return (int)sum;
    }
}