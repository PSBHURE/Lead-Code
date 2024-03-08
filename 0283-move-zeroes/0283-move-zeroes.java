class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,temp=0;
    
        for(i=0;i<nums.length-1;i++)
        {
       
            for(int j=i+1;j<nums.length;j++)
            {
                      if(nums[i]==0)
                       {
                           temp=nums[j];
                            nums[j]=nums[i];
                           nums[i]=temp;
                       }
            }
         
        // if(nums[j]==0)
        //    {
        //        temp=nums[i];
        //         nums[i]=nums[j];
        //        nums[j]=temp;
        //    }
           // j++;
        }
        
        
    }
}