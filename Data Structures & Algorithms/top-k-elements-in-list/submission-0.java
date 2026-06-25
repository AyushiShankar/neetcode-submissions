class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int target = 0;
        while (left <= right) {
            if (right < nums.length) {
                if (map.containsKey(nums[right]) && map.get(nums[right]) > 0) {
                    if (target < k) {
                        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

                        if (map.get(nums[left]) == 1) {
                            map.remove(nums[left]);
                            left++;
                        }

                        target++;
                    } else {
                        break;
                    }
                } else {
                    map.put(nums[left], map.getOrDefault(nums[left], 0) + 1);
                }
            }

            right++;
        }

       

        return (new ArrayList<>(map.values())).toArray();
    }
}
