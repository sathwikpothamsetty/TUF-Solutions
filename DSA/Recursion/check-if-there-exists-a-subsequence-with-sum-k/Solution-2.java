class Solution {
    private boolean fun(int idx,int n,int [] nums,int k)
    {
        if(k<0) return false;
        if(k==0) return true;
        if(idx==n)
        {
          return  k==0;
        }
        return fun(idx+1,n,nums,k-nums[idx]) || fun(idx+1,n,nums,k);
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
       
       return   fun(0,nums.length,nums,k);
    }
}