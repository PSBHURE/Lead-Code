class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==letter)
                count++;
        }
        return (count*100/s.length());
    }
}