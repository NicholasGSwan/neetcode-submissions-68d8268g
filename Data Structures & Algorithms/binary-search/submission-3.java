class Solution {
    public int search(int[] nums, int target) {
        int L = 0;
        int R = nums.length-1;

        int mid = L + ((R-L)/2);

        while(L <= R){
            
            if(nums[mid] > target){
                R = mid-1;
            }else if(nums[mid] < target){
                L = mid+1;
            }else{
                return mid;
            }
            mid = L + ((R-L)/2);
        }

 
        return -1;
    }
}
