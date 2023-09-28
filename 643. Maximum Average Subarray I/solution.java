class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        double maxAverage = 0;
        double sum = 0;
        double current = 0;
        double next = 0;


        if (nums.length == k) {
            for (int i=left;i<right+1;i++) {
                sum += nums[i];
            }
            return sum/k;
        }
        // for (int i=1;i<nums.length;i++) {
        //     if (right + i < nums.length && nums[left + i] >= nums[left] && nums[right + i] >= nums[right] ) {
        //         left++;
        //         right++;
        //     }
        // }
        // for (int i=1;i<nums.length;i++) {

        //     if (right + i < nums.length) {
        //         current = (nums[left] + nums[right])/2;
        //         next = (nums[left + i] + nums[right+i])/2;
        //         System.out.println(current);
        //         System.out.println(next);
        //         if (current < next) {

        //             left++;
        //             right++;
        //         }
        //         // System.out.println((nums[left]+nums[right]/2));
        //         // System.out.println((nums[left + i] + nums[right+i])/2);
        //         // left++;
        //         // right++;
        //         // System.out.println((nums[left]+nums[right]/2));
        //     }
        // }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(nums[left]);
        // System.out.println(nums[right]);
        for (int i=left;i<right+1;i++) {
            sum += nums[i];
        }

        maxAverage = sum/k;

        return maxAverage;
    }
}