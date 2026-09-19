class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int v=t-nums[i];
            if(mp.containsKey(v)) return new int[]{mp.get(v),i};
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
