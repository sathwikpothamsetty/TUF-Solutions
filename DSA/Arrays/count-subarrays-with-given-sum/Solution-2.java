class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int arr=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
           arr+=nums[i];
           int req=arr - k;
           cnt+=mpp.getOrDefault(req,0);
           mpp.put(arr,mpp.getOrDefault(arr,0)+1);
           
        }
        return cnt;
    }
}