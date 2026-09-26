class Solution {
public:
    void reverseString(vector<char>& st) {
        int l = 0;
        int r = st.size() - 1;
        
        while (l < r) {
            swap(st[l], st[r]);
            l++;
            r--;
        }
    }
};
