class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        Set<Integer> s= new HashSet<>();
        int l=0;
        for(int r:nums){
            if(s.contains(r)) return true;
            s.add(r); 
        }
        return false;
    }
}