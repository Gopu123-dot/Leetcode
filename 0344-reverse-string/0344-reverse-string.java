class Solution {
    public void reverseString(char[] s) {
        char a[]=new char[s.length];
        for(int i=s.length-1;i>=0;i--) {
            a[s.length-1-i]=s[i];
        }
        for(int i=0;i<s.length;i++) {
            s[i]=a[i];
        }
    }
}