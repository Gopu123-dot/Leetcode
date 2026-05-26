class Solution {
    public int numberOfSpecialChars(String word) {
        boolean []upper=new boolean[26];
        boolean []lower=new boolean[26];
        for(char c:word.toCharArray()) {
            if(c>='a' && c<='z')
            lower[c-'a']=true;
            else
            upper[c-'A']=true;
        }
        int c=0;
        for(int i=0;i<26;i++) {
            if(upper[i] && lower[i])
            c++;
        }
        return c;
    }
}