
class Solution {
    public int[] twoSum(int[] num, int t) {
        // Map to store: Key = the number, Value = its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < num.length; i++) {
            int complement = t - num[i];
            
            // Check if the target's complement is already in our map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement)+1, i+1 }; // 0-based indexing for LeetCode
            }
            
            // If not found, save the current number and index to the map
            map.put(num[i], i);
        }
        
        return new int[] {-1, -1};
    }
}
