class Solution {
public:
    int lengthOfLongestSubstring(string s) {
     unordered_map<char, int> mp;
        int l = 0; 
        int len = 0;
        
        for (int r = 0; r < s.length(); r++) {
            char c = s[r];
            mp[c]++; 
            while (mp[c] > 1) {
                char v = s[l];
                mp[v]--;
                l++;
            }
            
            len =max(len, r - l + 1);
        }
        return len;
    }    
    
};
