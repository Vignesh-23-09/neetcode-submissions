class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // Base case: an empty array or single element
        if (nums == null || nums.length == 0) return 0;
        
        int maxLength = 1;
        int inc = 1; // Tracks current strictly increasing subarray length
        int dec = 1; // Tracks current strictly decreasing subarray length
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1; // Reset decreasing sequence
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1; // Reset increasing sequence
            } else {
                // Elements are equal: both trends break
                inc = 1;
                dec = 1;
            }
            
            // Keep track of the longest subarray seen so far
            maxLength = Math.max(maxLength, Math.max(inc, dec));
        }
        
        return maxLength;
    }
}
