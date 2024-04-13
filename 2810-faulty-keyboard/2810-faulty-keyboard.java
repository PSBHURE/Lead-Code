class Solution {
    public String finalString(String s) {
        char[] arr=s.toCharArray();
        StringBuffer temp=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='i')
                temp.reverse();
            else
            {
                temp.append(arr[i]);
            }
        }
        return new String(temp);
    }
}