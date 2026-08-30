class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int minIdx = 0;
        int maxIdx = 0;

        // Step 1: Find the indices of the minimum and maximum elements
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        // Step 2: Ensure leftIdx is always smaller than rightIdx for simpler math
        int leftIdx = Math.min(minIdx, maxIdx);
        int rightIdx = Math.max(minIdx, maxIdx);

        // Step 3: Calculate the 3 possible deletion strategies
        int removeFromFront = rightIdx + 1;
        int removeFromBack = n - leftIdx;
        int removeFromBoth = (leftIdx + 1) + (n - rightIdx);

        // Step 4: Return the minimum of the three strategies
        return Math.min(removeFromFront, Math.min(removeFromBack, removeFromBoth));
    }
}
