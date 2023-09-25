class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num: nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        ////////// First attempt
        // int backIndex = nums.length-1;
        // int lastZero = 0;
        // int i = 0;
        // int temp = 0;
        // while (i < backIndex-lastZero) {
        //     if (nums[i] == 0) {
        //         temp = nums[backIndex-lastZero];
        //         nums[backIndex-lastZero] = 0;
        //         nums[i] = temp;
        //         lastZero++;
        //     }
        //     i++;
        // }



        ////////// Bad solution
        // int temp = 0;
        // for (int i=0;i<nums.length;i++) {
        //     if (nums[i] == 0 && i+1 < nums.length) {
        //         int j = i+1;
        //         while (j<nums.length-1 && nums[j] == 0) {
        //                 j++;
        //         }
        //         temp = nums[j];
        //         nums[j] = 0;
        //         nums[i] = temp;
        //     }
        // }
    }
}