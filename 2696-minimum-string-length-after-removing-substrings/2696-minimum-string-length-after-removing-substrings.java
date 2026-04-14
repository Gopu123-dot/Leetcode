class Solution {
    public int minLength(String s) {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(!st.isEmpty()) {
                char t=st.peek();
                if(t=='A' && s.charAt(i)=='B' || t=='C' && s.charAt(i)=='D') {
                    st.pop();
                    continue;
                }
            }
            st.push(s.charAt(i));
        }
        return st.size();
    }
}