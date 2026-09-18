class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() > nums.length / 2){
                return m.getKey();
            }
        }
        return 0;
    }
}