class Solution {
public:
    string minWindow(string s, string t) {
         vector<int> a(256, 0);
         for(char c:t) a[c]++;
         int l=0,cnt=t.length(),st=0,len=INT_MAX;
         for(int r=0;r<s.length();r++){
            char c=s[r];
            if(a[c]-->0) cnt--;
            while(cnt==0){
                if(r-l+1<len){
                    len=r-l+1;
                    st=l;
                }
                if(++a[s[l++]]>0) cnt++;
            }
         }
         return len==INT_MAX?"":s.substr(st,len);
    }
};
