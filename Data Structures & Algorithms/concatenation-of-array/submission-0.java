class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
        int ind=nums.length;
        for(int i=0;i<nums.length;i++){
            a[ind++]=nums[i];
        }
        return a;
    }
}