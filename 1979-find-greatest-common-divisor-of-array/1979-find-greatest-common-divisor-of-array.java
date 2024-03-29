class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
        for(int x:nums)
            System.out.print(x+" ");
       int min=nums[0],max=nums[nums.length-1];
        if(min==max)
            return min;
       int m=max;
        for(int i=1;i<=max;i++)
        {
           if(min%i==0 && max%i==0 )
               m=i;
        }
        return m;
    }
}