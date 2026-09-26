class Solution {
public:
    int maxDifference(string s) {
        unordered_map<char,int>mp;
        for(char c:s) mp[c]++;
        int mi=10000; int ma=0;
        for(auto& [k,v]:mp){
            if(v%2==1) ma=max(ma,v);
            else mi=min(mi,v);
        }
        return ma-mi;
    }
};