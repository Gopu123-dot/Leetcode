class Solution {
    public int numberOfSubstrings(String s) {
        int res[]=new int[3];
        int l=0,c=0,sum=0;
        for(int r=0;r<s.length();r++) {
            res[s.charAt(r)-'a']++;
            while(res[0]>0 && res[1]>0 && res[2]>0) {
                sum+=s.length()-r;
                res[s.charAt(l)-'a']--;
                l++;
            }
        }
        return sum;
    }
}