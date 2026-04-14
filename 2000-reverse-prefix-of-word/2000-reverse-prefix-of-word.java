class Solution {
    public String reversePrefix(String word, char ch) {
        Stack <Character> st=new Stack<>();
        int i=0;
        for(i=0;i<word.length();i++) {
            char c=word.charAt(i);
            if(c!=ch)
            st.push(c);
            else {
                st.push(c);
                break;
            }
        }
        if(i==word.length())
        return word;
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        for(int j=i+1;j<word.length();j++) {
            sb.append(word.charAt(j));
        }
        return sb.toString();
    }
}