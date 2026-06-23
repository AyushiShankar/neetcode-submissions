class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int right = 0;
        int count =0;
        for(int i = 0; i <text2.length(); i++){
            char ch = text2.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        while(right < text1.length()){
            char ch = text1.charAt(right);
            if(map.containsKey(ch) && map.get(ch)> 0){
            count++;
            }
right++;
        }

        return (count == 0) ? 0 : count;        
    }
}
