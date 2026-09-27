class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {

        for(int i=0;i<f.length;i++){
          if(f[i]==0){
            boolean l=(i==0 || f[i-1]==0);
            boolean r=(i==f.length-1 || f[i+1]==0);
            if(l && r) {
                f[i]=1;
                n--;
                }
          }
        }
        return n<=0;
    }
}