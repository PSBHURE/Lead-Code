class Solution {
    public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) {
            return;
        }
        
        int left = 0; // Pointer to track non-zero elements
        int right = 0; // Pointer to iterate through the array
        
        // Iterate through the array
        while (right < nums.length) {
            // If the current element is non-zero
            if (nums[right] != 0) {
                // Swap the non-zero element with the left pointer element
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                // Move the left pointer to the next position
                left++;
            }
            
            // Move the right pointer to the next position
            right++;
        }
        
    }
}