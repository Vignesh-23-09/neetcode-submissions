class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        // Map to store: [Element -> Its Index in nums2]
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int j = 0; j < nums2.length; j++) {
            indexMap.put(nums2[j], j);
        }
        
        // Find the next greater element
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int targetIndex = indexMap.get(target); // Instant lookup!
            int nextGreater = -1;
            
            // Look to the right in nums2
            for (int k = targetIndex + 1; k < nums2.length; k++) {
                if (nums2[k] > target) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        
        return result;
    }
}
