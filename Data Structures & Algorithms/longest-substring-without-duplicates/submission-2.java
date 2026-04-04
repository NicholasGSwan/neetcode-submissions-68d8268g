class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int L = 0;
        int R = 0;
        int max = 0;

        while (R < s.length()){
            while(L <= R && !set.add(s.charAt(R))){
                set.remove(s.charAt(L));
                L++;
            }
            R++;
            max = Math.max(max, R-L);
        } 
        return max;
    }
}
