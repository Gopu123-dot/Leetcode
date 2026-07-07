class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>h=new HashMap<>();
        for(String s:strs) {
            char []c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            while(!h.containsKey(key)) {
                h.put(key,new ArrayList<>());
            }
            h.get(key).add(s);
        }
        return new ArrayList<>(h.values());
    }
}