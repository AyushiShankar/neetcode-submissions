class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0, right = heights.length - 1;
        int area = 0;
        while (left <= right) {
            area = Math.min(heights[left], heights[right]) * (right - left);
            if (area < maxArea) {
                right--;
            }
            maxArea = Math.max(maxArea, area);
            left++;
        }
        return maxArea;
    }
}
