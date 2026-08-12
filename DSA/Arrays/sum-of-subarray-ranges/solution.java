import java.util.*;

class Solution {

    public int[] findnse(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }

        return ans;
    }

    public int[] findnge(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }

        return ans;
    }

    public int[] findpse(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }

        return ans;
    }

    public int[] findpge(int[] arr) {
        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }

        return ans;
    }

    public long sumSubarrayMins(int[] arr) {
        int[] nse = findnse(arr);
        int[] pse = findpse(arr);

        int n = arr.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            int left = i - pse[i];
            int right = nse[i] - i;

            long freq = left * right * 1L;
            long val = freq * arr[i];

            sum += val;
        }

        return sum;
    }

    public long sumSubarrayMaxs(int[] arr) {
        int[] nge = findnge(arr);
        int[] pge = findpge(arr);

        int n = arr.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            int left = i - pge[i];
            int right = nge[i] - i;

            long freq = left * right * 1L;
            long val = freq * arr[i];

            sum += val;
        }

        return sum;
    }

    public long subArrayRanges(int[] arr) {
        return sumSubarrayMaxs(arr) - sumSubarrayMins(arr);
    }
}