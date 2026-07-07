class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()) {
            sb.append("#").append(c);
        }
        sb.append("#");
        String s1=sb.toString();
        int f[]=new int[s1.length()];
        int l=0,r=0,m=0,c=0,st=0;
        for(int i=0;i<s1.length();i++) {
            l=i-1;
            r=i+1;
            while(l>=0 && r<s1.length() && s1.charAt(l)==s1.charAt(r)) {
                f[i]++;
                l--;
                r++;
            }
            if(f[i]>m) {
                m=f[i];
                c=i;
            }
        }
        st=(c-m)/2;
        return s.substring(st,st+m);
    }
}