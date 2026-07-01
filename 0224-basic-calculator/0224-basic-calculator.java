class Solution {
    public int calculate(String s) {
        Stack <Integer>st=new Stack<>();
        int r=0,n=0,sign=1;
        for(char c:s.toCharArray()) {
            if(Character.isDigit(c)) {
                n=n*10+(c-'0');
            }
            else if(c=='+') {
                r+=sign*n;
                sign=1;
                n=0;
            }
            else if(c=='-'){
                r+=sign*n;
                n=0;
                sign=-1;
            }
            else if(c=='(') {
                st.push(r);
                st.push(sign);
                r=0;
                sign=1;
            }
            else if(c==')') {
                r+=sign*n;
                n=0;
                r*=st.pop();
                r+=st.pop();
            }
        }
        r+=sign*n;
        return r;
    }
}