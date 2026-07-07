class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []word=s.split(" ");
        if(word.length!=pattern.length())
        return false;
        HashMap<Character,String>h=new HashMap<>();
        for(int i=0;i<pattern.length();i++) {
            char c=pattern.charAt(i);
            if(h.containsKey(c)) {
                if(!h.get(c).equals(word[i]))
                return false;
            }
            else {
                if(h.containsValue(word[i])) {
                    return false;
                }
                h.put(c,word[i]);
            }
        }
        return true;
    }
}