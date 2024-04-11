class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr=new int[2];
        int count1=0;
        int count2=0;
        
        Set<Integer>set1=new HashSet<>();
        for(int no1:nums1)
        {
            set1.add(no1);
        }
        
        Set<Integer>set2=new HashSet<>();
        for(int no2:nums2)
        {
            set2.add(no2);
        }
        
        for(int i=0;i<nums1.length;i++)
        {
            {
                if(set2.contains(nums1[i]))
                count1++;
            }
        }
        
        for(int j=0;j<nums2.length;j++)
        {
            {
                if(set1.contains(nums2[j]))
                count2++;
            }
        }
        
        arr[0]=count1;
        arr[1]=count2;
        
        return arr;
    }
}
        
        
        

