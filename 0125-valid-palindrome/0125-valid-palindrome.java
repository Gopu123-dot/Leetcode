class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        int l=0,r=a.length()-1;
        while(l<r) {
            if(!Character.isLetterOrDigit(a.charAt(l))) {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(a.charAt(r))) {
                r--;
                continue;
            }
            if(a.charAt(l)!=a.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
}