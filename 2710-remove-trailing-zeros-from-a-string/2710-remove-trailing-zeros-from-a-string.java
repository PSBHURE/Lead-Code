class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder str=new StringBuilder();
        char[] arr=num.toCharArray();
        int s=0,e=0;
        for(int j=0;j<arr.length;j++)
        {
           if(arr[j]!='0')
               e=j;
        }
        for(s=0;s<=e;s++)
        {
            str.append(arr[s]);
        }
        return new String(str);
    }
}