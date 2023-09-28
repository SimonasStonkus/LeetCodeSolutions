class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /// Im a genuine moron this should not have taken this long to solve, I just wasnt implementing sliding window correctly
        int left = 0;
        int right = k - 1;
        double maxAverage = 0;
        double sum = 0;


        for (int i=0;i<k;i++) {
            sum += nums[i];
        }
        maxAverage = sum/k;

        while (right+1 < nums.length) {
            sum = sum - nums[left] + nums[right+1];
            if (sum/k > maxAverage) {
                maxAverage = sum/k;
            }
            left++;
            right++;
        }

        return maxAverage;
    }
}