class Solution {
    public int trap(int[] height) {
        int sum = 0, left = 0;
        int right = 1;
        while (left < right) {
            if (height[left] == 0) {
                left++;
                right++;
            } else if (height[right] == 0 && right < height.length - 2)
                right++;
            else if (right - left == 1) {
                right++;
            } else {
                int area = Math.min(height[left], height[right]) * (right - left);
                sum += area;
                left = right;
                right++;
            }
        }
        return sum;
    }
}
