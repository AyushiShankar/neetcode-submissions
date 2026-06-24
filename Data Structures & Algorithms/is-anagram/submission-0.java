class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        int right = s.length();
        while (left < right) {
            char ch = s.charAt(left);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }

            } else {
                return false;
            }

            left++;
        }

        return map.isEmpty();
    }
}
