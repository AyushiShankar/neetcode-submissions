class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return false;
        int right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < nums.length) {
            if(map.containsKey(nums[right]) && map.get(nums[right])>0){
                return true;
            }
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            right++;
        }

        return false;
    }
}