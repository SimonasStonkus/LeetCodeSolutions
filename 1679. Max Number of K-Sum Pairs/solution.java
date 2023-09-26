class Solution {
    //// Very slow solution (beats 7.75%)
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> indices = new HashMap<Integer,Integer>();
        int counter = 0;
        int remainder = 0;

        for (int i=0;i<nums.length;i++) {
            remainder = k-nums[i];
            if (indices.containsKey(nums[i])) {
                indices.put(nums[i],indices.get(nums[i])+1);
            } else {
                indices.put(nums[i],1);
            }

            if (indices.containsKey(remainder) && indices.get(remainder) > 0 && remainder != nums[i]) {
                counter++;
                indices.put(remainder,indices.get(remainder)-1);
                indices.put(nums[i],indices.get(nums[i])-1);
            }
            if (remainder == nums[i] && indices.get(remainder) > 1) {
                counter++;
                indices.put(remainder,indices.get(remainder)-2);
            }
        }


        return counter;
    }
}