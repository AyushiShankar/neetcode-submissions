// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int [] result = new int[2];
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if((nums[i]+ nums[j]) == target)
//                 result =  new int[]{i, j};
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int m=target-nums[i];
        
        if(mp.containsKey(m)){
            return new int[]{mp.get(m),i};
        }
        
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
