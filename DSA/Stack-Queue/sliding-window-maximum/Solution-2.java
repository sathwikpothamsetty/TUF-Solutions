class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int[] ans = new int[n - k + 1];
        int ansidx=0;
        Deque<Integer> dp=new LinkedList<>();


        for(int i=0;i<n;i++)
        {

          if(!dp.isEmpty() && dp.peekFirst() <=i-k)
          {
            dp.pollFirst();
          }
            while(!dp.isEmpty() && arr[dp.peekLast()]<=arr[i])
            {
                dp.pollLast();
            }
          
            dp.offerLast(i);
            if(i>=k-1)
            {
                ans[ansidx++]=arr[dp.peekFirst()];
            }
        }
        return ans;
    
    }
}
