class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        
        Map<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            Character ch1=s1.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        
        Map<Character,Integer>map2=new HashMap<>();
        for(int j=0;j<s2.length();j++)
        {
            Character ch2=s2.charAt(j);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        
        for(int k=0;k<s1.length();k++)
        {
            Character ch3=s1.charAt(k);
            if(map1.get(ch3)!=map2.get(ch3))
                return false;
        }
        
         int count=0;
        
        for(int l=0;l<s1.length();l++)
        {
            if(s1.charAt(l)!=s2.charAt(l))
                count++;
        }
        
        if(count==0 || count==1 || count==2)
            return true;
        
        return false;
        
        
    }
}