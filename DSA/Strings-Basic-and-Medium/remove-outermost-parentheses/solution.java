class Solution {
    public String removeOuterParentheses(String s) {
        // Your code goes here
        StringBuilder res = new StringBuilder();
        int req=0;

        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                if(req>0) res.append(c);
                req++;
            }else
            {
                req--;
                if(req > 0) res.append(c);
            }
        }
        return res.toString();
    }
}