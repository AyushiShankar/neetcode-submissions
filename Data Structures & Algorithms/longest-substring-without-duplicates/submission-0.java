class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int right = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            while (map.containsKey(ch) && map.get(ch) > 0) {
                char chR = s.charAt(left);
                map.put(chR, map.getOrDefault(chR, 0) - 1);
                if (map.get(chR) == 0) {
                    map.remove(chR);
                }
                left++;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxLength = Math.max(maxLength, right - left+1);
            right++;
        }

        return maxLength;
    }
}
