class Solution
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        boolean flag=true;
        StringBuffer temp1=new StringBuffer();
        StringBuffer temp2=new StringBuffer();
        for(int i=0;i<word1.length;i++)
        {
           temp1.append(word1[i]);   
        }
        for(int j=0;j<word2.length;j++)
        {
            temp2.append(word2[j]);
        }
        String s1=new String(temp1);
        String s2=new String(temp2);
        if(s1.equals(s2))
            return true;
        
        else 
            return false;
        
    }
}