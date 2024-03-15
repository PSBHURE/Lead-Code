class Solution {
    public int numIdenticalPairs(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]==nums[j])&&(i<j))
                    list.add(i);
            }
        }
        return list.size();
    }
}