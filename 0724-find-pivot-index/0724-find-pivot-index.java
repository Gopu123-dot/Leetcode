class Solution {
    public int pivotIndex(int[] nums) {
        int t=0,ls=0,rs=0;
        for(int i=0;i<nums.length;i++) {
            t+=nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            rs=t-ls-nums[i];
            if(ls==rs)
            return i;
            else
            ls=ls+nums[i];
        }
        return -1;
    }
}