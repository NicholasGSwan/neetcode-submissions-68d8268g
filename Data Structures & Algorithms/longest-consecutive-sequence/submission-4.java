class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max = 0;
        for(int num: nums){
            if (!set.contains(num-1)){
                int currCnt = 0;
                while (set.contains(num+currCnt)) {
                    currCnt++;
                }
                max = Math.max(max, currCnt);
            }
        }
        return max;
    }
}
