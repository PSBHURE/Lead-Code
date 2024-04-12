class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        Set<Integer>set=new HashSet<>();
            
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            set.add(entry.getValue());
        }
        if(set.size()==1)
            return true;
        else
            return false;
    }
}