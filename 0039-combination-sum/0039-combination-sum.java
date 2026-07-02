class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>l=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),l);
        return l;
    }
    public void backtrack(int []candidates,int target,int ind,List<Integer> curr,List<List<Integer>>l) {
        if(target==0) {
            l.add(new ArrayList<>(curr));
            return;
        }
        else if(target<0) {
            return;
        }
        for(int i=ind;i<candidates.length;i++) {
            curr.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,curr,l);
            curr.remove(curr.size()-1);
        }
    }
}