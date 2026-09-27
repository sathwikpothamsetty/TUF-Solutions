class Solution {
    public int maxDepth(String s) {

        int cnt=0;
        int maxcnt=0;

      for(char c:s.toCharArray())
      {
        if(c=='(')
        {
            cnt++;
            maxcnt=Math.max(maxcnt,cnt);

        }else if (c==')')
        {
            cnt--;
        }
      }
      return maxcnt;
        // Your code goes here
    }
}