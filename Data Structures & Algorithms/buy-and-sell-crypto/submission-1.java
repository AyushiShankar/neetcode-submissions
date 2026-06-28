class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = prices.length - 1;
        int maxProfit = 0;
        while (left <= right) {
            if (prices[left] > prices[right]) {
                right--;
            } else {
               maxProfit = Math.max(maxProfit , prices[right] - prices[left]);
               left++;
            }
          
        }
        return maxProfit;
    }
}
