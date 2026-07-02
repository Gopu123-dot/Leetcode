class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        int s=0;
        for(int i=0;i<nums.length-2;i++) {
            int l=i+1;
            int r=nums.length-1;
            while(l<r) {
                s=nums[i]+nums[l]+nums[r];
                if(Math.abs(target-s)<Math.abs(target-closest)) {
                    closest=s;
                }
                if(s<target)
                l++;
                else if(s>target)
                r--;
                else
                return s;
            }
        }
        return closest;
    }
}