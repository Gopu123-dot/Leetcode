class Solution {
    public static boolean isVowel(char ch) {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int m=0,c=0;
        for(int i=0;i<s.length();i++) {
            if(isVowel(s.charAt(i))) 
                c++;
            if(i>=k) {
                if(isVowel(s.charAt(i-k)))
                    c--;
            }
            m=Math.max(m,c);
        }
        return m;
    }
    
}