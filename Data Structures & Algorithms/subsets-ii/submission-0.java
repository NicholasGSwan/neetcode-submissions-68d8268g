class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        //answer.add(new ArrayList<>());

        Arrays.sort(nums);
        return subsets(nums, 0, new ArrayList<>(), answer);
    }

    public List<List<Integer>> subsets(int[] nums, int i, List<Integer> current, List<List<Integer>> answer){
        if(i >= nums.length){
            answer.add(new ArrayList<>(current));
            return answer;
        }
        current.add(nums[i]);
        subsets(nums, i+1, current, answer);
        current.remove(current.size()-1);
        
        
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        subsets(nums, i+1, current, answer);

        return answer;
    }    



}
