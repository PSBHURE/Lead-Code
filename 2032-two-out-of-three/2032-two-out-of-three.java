class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<>();
        
        List<Integer> list1=new ArrayList<>();
        for(int i:nums1)
            list1.add(i);
        
        List<Integer> list2=new ArrayList<>();
        for(int j:nums2)
            list2.add(j);
        
        List<Integer> list3=new ArrayList<>();
        for(int k:nums3)
            list3.add(k);
        
        for(int l=0;l<nums1.length;l++)
        {
            if((list1.contains(nums1[l]) && list2.contains(nums1[l])) || (list1.contains(nums1[l]) && list3.contains(nums1[l])) || (list3.contains(nums1[l]) && list2.contains(nums1[l])))
            {
                if(!list.contains(nums1[l]))
                    list.add(nums1[l]);
            }
        }
        
        for(int m=0;m<nums2.length;m++)
        {
            if((list1.contains(nums2[m]) && list2.contains(nums2[m])) || (list1.contains(nums2[m]) && list3.contains(nums2[m])) || (list3.contains(nums2[m]) && list2.contains(nums2[m])))
            {
                if(!list.contains(nums2[m]))
                    list.add(nums2[m]);
            }
        }
        
         for(int n=0;n<nums3.length;n++)
        {
            if((list1.contains(nums3[n]) && list2.contains(nums3[n])) || (list1.contains(nums3[n]) && list3.contains(nums3[n])) || (list3.contains(nums3[n]) && list2.contains(nums3[n])))
            {
                if(!list.contains(nums3[n]))
                    list.add(nums3[n]);
            }
        }
        
        return list;
    }
}