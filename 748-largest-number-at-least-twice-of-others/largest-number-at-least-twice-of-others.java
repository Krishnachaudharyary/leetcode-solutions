class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int maxVal = nums[maxIndex];
        nums[maxIndex] = -1;

        for (int num : nums) {
            if (num != -1 && maxVal < 2 * num) {
                return -1;
            }
        }

        return maxIndex;
    }
}
