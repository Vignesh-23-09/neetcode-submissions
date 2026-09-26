class Solution {
    public int countSeniors(String[] d) {
        int c=0;
        for(String s:d){
        int n=(s.charAt(11)-'0')*10;
        n+=s.charAt(12)-'0';
        if(n>60)c++;
        }
      return c;  
    }
}