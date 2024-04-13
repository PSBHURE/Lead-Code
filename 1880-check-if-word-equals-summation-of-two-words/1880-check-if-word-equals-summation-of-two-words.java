class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<26;i++)
        {
            map.put((char)('a'+i),i);
        }
        StringBuffer temp1=new StringBuffer();
        StringBuffer temp2=new StringBuffer();
        StringBuffer temp3=new StringBuffer();
        
        for(int j=0;j<firstWord.length();j++)
        {
            temp1.append(map.get(firstWord.charAt(j)));
        }
        
        for(int k=0;k<secondWord.length();k++)
        {
            temp2.append(map.get(secondWord.charAt(k)));
        }
        
        for(int l=0;l<targetWord.length();l++)
        {
            temp3.append(map.get(targetWord.charAt(l)));
        }
        int x=Integer.parseInt(new String(temp1));
        int y=Integer.parseInt(new String(temp2));
        int z=Integer.parseInt(new String(temp3));
        if(x+y==z)
            return true;
        else
            return false;
    }
}