class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        String result="";
        for(char c:s.toCharArray()) {
            if(c>='a' && c<='z') 
            res.append(c);
            else if(c=='#')
            res.append(res);
            else if(c=='%')
            res.reverse();
            else if(c=='*') {
                if(res.length()>0) 
                res.deleteCharAt(res.length()-1);
            }
        }
        result=res.toString();
        return result;
    }
}