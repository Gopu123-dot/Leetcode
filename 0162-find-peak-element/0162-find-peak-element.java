class Solution {
    public int findPeakElement(int[] nums) {
        int m=Integer.MIN_VALUE,a=0;
        for(int i=0;i<nums.length;i++) {
            if(m<nums[i]) {
                m=nums[i];
                a=i;
            }
        }
        return a;
    }
}