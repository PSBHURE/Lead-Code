class Solution {
    public void reverseString(char[] s) {
         int start = 0;
        int end = s.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }   
    }
}