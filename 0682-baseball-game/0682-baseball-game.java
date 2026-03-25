class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for(String s:operations) {
            if(s.equals("+")) {
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(s.equals("C")) {
                st.pop();
            }
            else if(s.equals("D")) {
                st.push(2*st.peek());
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int s:st) {
            sum+=s;
        }
        return sum;
    }
}