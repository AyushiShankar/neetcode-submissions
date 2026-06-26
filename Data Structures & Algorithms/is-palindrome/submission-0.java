class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return false;
        int left = 0;
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
