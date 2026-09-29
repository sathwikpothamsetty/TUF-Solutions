class Solution {
 
    public List<Integer> orArray(List<Integer> nums) {
     
        List<Integer> res = new ArrayList<>();

        int n = nums.size();
    
        for (int i = 0; i < n - 1; i++) {
      
            int temp = nums.get(i) | nums.get(i + 1);

            res.add(temp);
        }

        return res;
    }
}