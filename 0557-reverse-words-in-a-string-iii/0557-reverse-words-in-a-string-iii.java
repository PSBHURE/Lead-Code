class Solution {
    public String reverseWords(String s) {
       String[] arr=s.split("\\s+");
        for(int i=0;i<arr.length;i++)
        {
            StringBuffer temp=new StringBuffer(arr[i]).reverse();
            arr[i]=new String(temp);
        }
        return String.join(" ",arr);
    }
}