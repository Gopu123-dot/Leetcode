class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0,count=0;
        for(int i=0;i<nums.length;i++) {
            c=0;
            for(int j=i;j<nums.length;j++) {
                if(nums[j]==target)
                c++;
                int l=j-i+1;
                if(c>l/2)
                count++;
            }
        }
        return count;
    }
}