class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split("\\s+");
        String[] arr1=new String[k];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=arr[i];
        }
        return String.join(" ",arr1);
    }
}