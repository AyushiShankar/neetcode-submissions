class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;
        int size = needle.length();

        for (int i = 0; i < haystack.length(); i++) {
            if ((i + size) < haystack.length()) {
                if (haystack.substring(i, i + size).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}