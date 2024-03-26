class Solution {
    public String sortSentence(String s) {
      // Split the input string by space into an array of words
        String[] words = s.split("\\s+");
        
        // Create a new array to hold the words sorted by their last character
        String[] sortedWords = new String[words.length];
        
        // Iterate through the words and extract the last character, then store them in the sorted array
        for (String word : words) {
            char lastChar = word.charAt(word.length() - 1);
            // The last character in the word determines its position in the sorted array
            sortedWords[lastChar - '1'] = word.substring(0, word.length() - 1);
        }

        // Join the sorted array of words into a single string
        return String.join(" ", sortedWords);
    }
}