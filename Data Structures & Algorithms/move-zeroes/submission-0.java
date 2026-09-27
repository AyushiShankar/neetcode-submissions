class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int zero = 0;
        int k =0;


        while (left < right) {
            if (nums[left] == 0 && nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
                left++;
            } else if (nums[left] == 0 && nums[right] == 0) {
                int temp = nums[--right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }
            zero++;
        }

     int j = nums.length - 1 - zero;

      for(int i = j-1; i > 0 ;i--){
        int temp = nums[i];
        nums[i] = nums[k];
        nums[k]= temp;
        k++;
        
      }
           
    }
}