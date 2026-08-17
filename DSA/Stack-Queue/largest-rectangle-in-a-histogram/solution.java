import java.util.*;

class Solution {

    public int largestRectangleArea(int[] arr) {

        int n = arr.length;

        int[] pse = findPSE(arr);
        int[] nse = findNSE(arr);

        int max = 0;

        for (int i = 0; i < n; i++) {

            int width = nse[i] - pse[i] - 1;

            int area = arr[i] * width;

            max = Math.max(max, area);
        }

        return max;
    }

    public int[] findPSE(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = -1;
            else
                ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }

    public int[] findNSE(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                ans[i] = n;
            else
                ans[i] = st.peek();

            st.push(i);
        }

        return ans;
    }
}