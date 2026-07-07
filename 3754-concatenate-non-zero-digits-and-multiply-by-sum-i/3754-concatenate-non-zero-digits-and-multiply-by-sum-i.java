class Solution {
    public long sumAndMultiply(int n) {
        long d=0,sum=0,ans=0,p=1;
        while(n>0) {
            d=n%10;
            if(d!=0) {
                ans=p*d+ans;
                p=p*10;
                sum+=d;
            }
            n/=10;
        }
        return ans*sum;
    }
}