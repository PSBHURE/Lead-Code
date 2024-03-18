class Solution {
    public int differenceOfSum(int[] nums) {
       int esum=0,dsum=0,r=0,temp=0;
        for(int j=0;j<nums.length;j++)
        {
             esum+=nums[j];
            if(nums[j]<10)
                dsum+=nums[j];
            else
            {
                temp=nums[j];
                while(temp>0)
                {
                    r=temp%10;
                    temp=temp/10;
                    dsum+=r;
                }
            }
        }
        return Math.abs(esum-dsum);
    }
}