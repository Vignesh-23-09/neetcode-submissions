class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int p=1,z=0;
        for(int ni:nums) {
           if(ni==0) z++;
            else p*=ni;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            if(z>1) a[i]=0;
            else if(z==1)   a[i] = (nums[i] == 0) ? p : 0;
            else a[i]=p/nums[i];
        }
        return a;
        
    }
}  
