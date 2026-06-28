class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.size() > k+1) {
                char chL = s.charAt(left);
                if (map.containsKey(chL)) {
                    map.put(chL, map.getOrDefault(chL, 0) - 1);

                    if (map.get(chL) == 0) {
                        map.remove(chL);
                    }
                    left++;
                }
            }
            if (map.size() <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }
        return maxLength;
    }
}
