class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums) {
            h.put(num,h.getOrDefault(num,0)+1);
        }
        for(int n:h.keySet()) {
            if(h.get(n)>1) {
                l.add(n);
            }
        }
        return l;
    }
}