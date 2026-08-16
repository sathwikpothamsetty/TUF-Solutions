class Solution {
    private int[] findPrefixMax(int[] arr, int n) {
        int[] prefixMax = new int[n];
        prefixMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        return prefixMax;
    }

    private int[] findSuffixMax(int[] arr, int n) {
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }

        return suffixMax;
    }

    public int trap(int[] height) {
        int n = height.length;
        int total = 0;

        int[] leftMax = findPrefixMax(height, n);
        int[] rightMax = findSuffixMax(height, n);

        for (int i = 0; i < n; i++) {
            if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
                total += Math.min(leftMax[i], rightMax[i]) - height[i];
            }
        }

        return total;
    }
}