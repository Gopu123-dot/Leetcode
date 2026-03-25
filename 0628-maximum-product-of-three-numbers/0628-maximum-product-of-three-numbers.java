class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[0]*nums[1]*nums[nums.length-1]);
        return a;
    }
}