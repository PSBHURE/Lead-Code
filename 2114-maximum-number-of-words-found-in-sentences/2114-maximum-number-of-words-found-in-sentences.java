class Solution {
    public int mostWordsFound(String[] sentences) {
    int max=0;
        for(String sentence:sentences)
        {
            String[] word=sentence.split(" ");
            max=Math.max(max,word.length);
        }
        return max;
    }
}