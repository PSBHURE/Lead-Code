class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuffer temp=new StringBuffer();
       for(String s1:words) 
       {
           temp.append(s1.charAt(0));
       }
        String s2=new String(temp);
        return s2.equals(s);
    }
}