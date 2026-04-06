class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] > 0){
                return ans;
            }
            if ( i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            int j = i + 1;
            int k = nums.length-1;
            while (j < k) {
                if (nums[j] + nums[k] + nums[i] > 0){
                    k--;
                    while (k > j && nums[k+1]== nums[k] ){
                        k--;
                    }
                }else if (nums[j] + nums[k] + nums[i] < 0){
                    j++;
                    while (j < k &&  nums[j] == nums[j -1]){
                        j++;
                    }
                }else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        ans.add(list);
                        j++;
                                            while (j < k &&  nums[j] == nums[j -1]){
                        j++;
                    }
                }
            }
            
        }
        return ans;
    }
}
