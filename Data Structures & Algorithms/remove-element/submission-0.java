class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int v=0;int c=0;
        for(int i:nums){
            if(i!=val){
                nums[v++]=i;
                c++;
            }
        }
        return c
        ;
    }
}