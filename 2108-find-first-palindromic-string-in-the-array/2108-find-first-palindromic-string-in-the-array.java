class Solution
{
    public String firstPalindrome(String[] words)
    {
        for(int i=0;i<words.length;i++)
        {  
         char[] arr=words[i].toCharArray();
         int start=0;
         int end=arr.length-1;
         
          while(start<end)
          {
              char ch=arr[start];
              arr[start]=arr[end];
              arr[end]=ch;
              start++;
              end--;
          }
            if(words[i].equals(String.valueOf(arr)))
                return words[i];
        }
        return "";
    }
}