class Solution {
    public int search(int[] nums, int target) {
        int L = 0;
        int R = nums.length-1;

        int mid = L + ((R-L)/2);

        while(L < mid && mid < R){
            
            if(nums[mid] > target){
                R = mid;
            }else if(nums[mid] < target){
                L = mid;
            }else{
                return mid;
            }
            mid = L + ((R-L)/2);
        }

        if(nums[L] == target){
            return L;
        }else if(nums[R] == target){
            return R;
        }
        return -1;
    }
}
