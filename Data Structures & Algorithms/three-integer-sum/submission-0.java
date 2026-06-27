class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if ((nums[left] + nums[right] + nums[right - 1]) == 0) {
                set.add(Arrays.asList(nums[left], nums[right], nums[right - 1]));
            }
            right--;
        }

        return new ArrayList<>(set);
    }
}
