class Solution {
public:
    vector<int> twoSum(vector<int>& num, int t) {
        unordered_map<int,int>mp;
        for(int i=0;i<num.size();i++){
            int s=t-num[i];
            if(mp.count(s)) return {mp[s]+1,i+1};
            mp[num[i]]=i;
        }
        return {-1,-1};
    }
};
