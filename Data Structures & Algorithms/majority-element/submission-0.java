

class Solution { 
    public int majorityElement(int[] nums) { 
        int m = 0, k = 0; 
        // 1. Corrected syntax: 'Integer' must be capitalized
        Map<Integer, Integer> mp = new HashMap<>(); 
        
        for(int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1); 
        }
        
        for(int i : mp.keySet()){ 
            if(mp.get(i) > m) { 
                m = mp.get(i); 
                k = i; 
            } 
        } 
        
        // 2. Corrected logic: Check the count (m), not the element value (k)
        if(m > nums.length / 2) {
            return k; 
        } else {
            return 0; 
        }
    } 
}
