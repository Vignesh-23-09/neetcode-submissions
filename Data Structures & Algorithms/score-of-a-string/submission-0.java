class Solution {
    public int scoreOfString(String s) {
        char c[]=s.toCharArray();
        int sum=0;
        for(int i=1;i<c.length;i++){
            sum+=Math.abs(c[i]-c[i-1]);
        }
        return sum;
    }
}