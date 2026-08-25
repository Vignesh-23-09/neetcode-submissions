class Solution {
    public boolean isSubsequence(String s, String t) {
        int cnt=0;
        int l=0; int r=0;
        while(l<s.length() && r<t.length()){
            if(s.charAt(l)==t.charAt(r)) {
                cnt++;
                l++; r++;
            }
            else r++;
        }
        return cnt==s.length();
    }
}