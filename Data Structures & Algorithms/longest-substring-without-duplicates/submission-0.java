class Solution {
    public int lengthOfLongestSubstring(String s) {
     Map<Character,Integer> mp = new HashMap<>();
     int l=0; int len=0;
     for(int r=0;r<s.length();r++){
        char c=s.charAt(r);
        mp.put(c,mp.getOrDefault(c,0)+1);
              while (mp.get(c) > 1) {
                char v=s.charAt(l);
               mp.put(v,mp.get(v)-1);
                l++;
            }
            len=Math.max(len,r-l+1);
     }
     return len;
    }
}
