class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int n:h.values()) {
            if(n>=2)
            return true;
        }
        return false;
    }
}
