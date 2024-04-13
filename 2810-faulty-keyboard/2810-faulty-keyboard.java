class Solution {
    public String finalString(String s) {
        
        StringBuffer temp=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i')
                temp.reverse();
            else
            {
                temp.append(s.charAt(i));
            }
        }
        return new String(temp);
    }
}