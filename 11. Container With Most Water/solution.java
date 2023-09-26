class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxDepth = 0;
        int width = height.length -1;

        while (left < right) {
            if (maxDepth < width * Math.min(height[left],height[right])) {
                maxDepth = width * Math.min(height[left],height[right]);
            }
            width--;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

            //System.out.println(right-left-1);
            // if (width * Math.min(height[left+1],height[right]) > width * Math.min(height[left],height[right-1])) {
            //     left ++;
            // } else {
            //     right--;
            // }
        }


        return maxDepth;
    }
}