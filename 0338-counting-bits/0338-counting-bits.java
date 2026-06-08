class Solution {
    public int[] countBits(int n) {
        int []dp=new int[n+1];
        for(int i=0;i<=n;i++) {
            int num=i;
            int c=0;
            while(num>0) {
                c+=num%2;
                num/=2;
            }
            dp[i]=c;
        }
        return dp;
    }
}