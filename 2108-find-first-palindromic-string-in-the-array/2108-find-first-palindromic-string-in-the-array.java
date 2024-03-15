class Solution
{
    public String firstPalindrome(String[] words)
    {
       for(String word:words)
       {
           StringBuffer rev=new StringBuffer(word).reverse();
           if(word.equals(rev.toString()))
               return word;
       }
        return "";
    }
}
