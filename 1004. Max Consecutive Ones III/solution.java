class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int nZeros = 0;
        int maxLength = 0;
        while (right<nums.length) {
            if (nZeros > k) {
                if (nums[left] == 0) {
                    nZeros--;
                }
                left++;

            } else if (nums[right] != 0) {
                right++;

            } else if (nums[right] == 0) {
                nZeros++;
                right++;
            }
            if (maxLength < right-left && nZeros <= k) {
                maxLength = right-left;
            }

        }
        return maxLength;
    }
}