class Solution {
    public int mostFrequentEven(int[] nums) {
       Arrays.sort(nums);
        Map<Integer,Integer>map=new LinkedHashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int k=-1,v=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getKey()%2==0 && entry.getValue()>v)
            {
                    v=entry.getValue();
                    k=entry.getKey();
                
            }
        }
        if(k==-1)
            return -1;
        return k;
    }
}