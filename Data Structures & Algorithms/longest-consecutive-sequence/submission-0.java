class Solution {
    public int longestConsecutive(int[] nums) {

        int maxLength = Integer.MIN_VALUE;

        Set<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        for(int n : set){
            if(!set.contains(n-1)){
                int current = n;
                int length = 1;

                while(set.contains(current+1)){
                    current++;
                    length++;
                }

                 maxLength = Math.max(maxLength, length);
            }

           
            
        }

return maxLength;
    }
}
