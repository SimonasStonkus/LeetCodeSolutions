class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indices = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            int distanceToTarget = target - nums[i];
            if (indices.containsKey(distanceToTarget)) {
                return new int[] {i,indices.get(distanceToTarget)};
            } else {
                indices.put(nums[i],i);
            }
        }
        return new int[] {0,0};
    }
}