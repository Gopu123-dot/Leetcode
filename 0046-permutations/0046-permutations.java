class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        boolean[] v=new boolean[nums.length];
        backtrack(nums,v,new ArrayList<>(),l);
        return l;
    }
    public static void backtrack(int nums[],boolean[]v,List<Integer> curr,List<List<Integer>>l) {
        if(curr.size()==nums.length) {
            l.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(v[i])
            continue;
            v[i]=true;
            curr.add(nums[i]);
            backtrack(nums,v,curr,l);
            curr.remove(curr.size()-1);
            v[i]=false;
        }
    }
}