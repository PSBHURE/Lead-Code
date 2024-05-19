class Solution {
    public String replaceDigits(String s) {
        char[] arr=s.toCharArray();
        int right=0;
        char ch='a';
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                 ch=arr[i];
            }
            if(i%2==1  && Character.isDigit(arr[i]))
                arr[i]=(char)(ch+Integer.parseInt(String.valueOf(arr[i])));
            
            
            
        }
        return String.valueOf(arr);
    }
}