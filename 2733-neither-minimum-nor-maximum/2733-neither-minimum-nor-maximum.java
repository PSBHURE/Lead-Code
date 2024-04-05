class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2)
            return -1;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=max && nums[i]!=min)
                return nums[i];
        }
        return 0;
    }
}