class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int i=0;i<nums.length;i++) {
            if (nums[i] <= a) {
                a = nums[i];
            } else if (nums[i] <= b) {
                b = nums[i];
            } else {
                return true;
            }
        }

        // for (int i=0;i<nums.length;i++) {
        //     if (i+2 >= nums.length) {
        //         return false;
        //     }
        //     System.out.println(i);
        //     if (nums[i] < nums[i+1] && nums[i+1] < nums[i+2]) {
        //         return true;
        //     }
        // }
        return false;
    }
}