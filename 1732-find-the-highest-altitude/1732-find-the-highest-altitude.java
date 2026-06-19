class Solution {
    public int largestAltitude(int[] gain) {
        int ans[]=new int[gain.length+1];
        int max=0,sum=0;
        for(int num:gain) {
            sum+=num;
            if(max<sum)
            max=sum;
        }
        return max;
    }
}