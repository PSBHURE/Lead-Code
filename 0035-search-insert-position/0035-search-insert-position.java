class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return i;
            if(i==nums.length-1 && target>nums[i])
                 return nums.length;
            if( target<nums[0])
                 return 0;
        }
         for(int i=0;i<nums.length-1;i++)
        {
             
            if(target>nums[i] && target<nums[i+1])
                return i+1;
             
                
        }
        return -1;
    }
}