class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),l);
        return l;
    }
    public static void backtrack(int ind,int []nums,List<Integer> curr,List<List<Integer>>l) {
        l.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++) {
            curr.add(nums[i]);
            backtrack(i+1,nums,curr,l);
            curr.remove(curr.size()-1);
        }
    }
}