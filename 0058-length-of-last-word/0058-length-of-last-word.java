class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] arr=s.split("\\s+");
        String maxl=arr[arr.length-1];
        return maxl.length();
    }
}