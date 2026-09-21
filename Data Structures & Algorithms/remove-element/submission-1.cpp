class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int c=0,v=0;
        for( int i:nums){
            if(i!=val){
                nums[v++]=i;
                c++;
            }
        }
        return c;
    }
};