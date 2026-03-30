class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        
        return subsets(nums, 0, new ArrayList<>(), answer);
    }
    public List<List<Integer>> subsets(int[] nums, int i, List<Integer> current, List<List<Integer>> answer){
        if(i >= nums.length){
            answer.add(current);
            return answer;
        }
        
        answer = subsets(nums, i+1, current, answer);
        
        current = new ArrayList<>(current);
        current.add(nums[i]);
        
        answer = subsets(nums, i+1, current, answer);
        
        return answer;
    }
}
