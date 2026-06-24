class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        if(nums.length == 0 || nums.length == 1) return false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }
}