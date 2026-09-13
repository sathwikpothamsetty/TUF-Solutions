class Solution {
    public double myPow(double x, int n) {
          //your code goes here
        if(n==0 || x==1.0) return 1;

        long temp=n;
        if(n<0)
        {
            x=1/x;
            temp=-1L*n;
        }
           double ans = 1;

       while(temp>0)
       {
        if(temp%2==1)
        {
            ans*=x;
        }
          x*=x;
          temp/=2;
       }
        return ans;
    }
}