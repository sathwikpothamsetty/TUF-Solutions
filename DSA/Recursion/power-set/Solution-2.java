class Solution {

    private void bt(int idx,int n,int [] nums,  List<Integer> curr,List<List<Integer>> res)
    {
        if(idx==n)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        bt(idx+1,n,nums,curr,res);
        curr.add(nums[idx]);
        bt(idx+1,n,nums,curr,res);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        bt(0,nums.length,nums,curr,res);
        return res; 
    }
}