class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int target = 0;
        int[] result = new int[k];
        while (left <= right && right < nums.length) {
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
            

            right++;
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            result[i] = key;
            i++;
        }

        return result;
    }
}
