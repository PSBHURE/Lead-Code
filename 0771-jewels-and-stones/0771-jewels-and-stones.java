class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] arr=jewels.toCharArray();
        char[] arr1=stones.toCharArray();
        
        Set<Character>set=new HashSet<>();
        for(char ch1:arr)
        {
            set.add(ch1);
        }
        
        List<Character> list=new ArrayList<>();
        for(char ch:set)
        {
            list.add(ch);
        }
        
        Map<Character,Integer>map=new HashMap<>();
        for(char ch2:arr1)
        {
            map.put(ch2,map.getOrDefault(ch2,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            if(set.contains(entry.getKey()))
                count+=entry.getValue();
                
        }
        return count;
    }
}