class Solution {
    public String minWindow(String s, String t) {
       int a[]=new int[256];
       for(char c:t.toCharArray()) a[c]++;
       int l=0,cnt=t.length(),st=0,len=Integer.MAX_VALUE;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(a[c]-->0) cnt--;
        while(cnt==0){
            if(i-l+1<len){
                len=i-l+1;
                st=l;
            }
            if(++a[s.charAt(l++)]>0) cnt++;
        }
       } 
          return len==Integer.MAX_VALUE? "":s.substring(st,st+len);
    }
}
