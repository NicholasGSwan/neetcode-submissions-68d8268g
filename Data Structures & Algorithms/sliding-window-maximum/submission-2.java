class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arrLen = nums.length - k +1;
        int[] ans = new int[arrLen];
        Deque<Integer> deq = new ArrayDeque<>();

        for(int i = 0; i < k; i++){
            if(deq.isEmpty()){
                deq.addLast(nums[i]);
            }else{
                while(!deq.isEmpty() && deq.peekLast() < nums[i]){
                    deq.removeLast();
                }
                deq.addLast(nums[i]);
            }
        }
        ans[0] = deq.peekFirst();

        for(int i = 1; i+k <= nums.length; i++){
            if(nums[i-1] == deq.peekFirst()){
                deq.removeFirst();
            }
            while(!deq.isEmpty() && deq.peekLast() < nums[i+k-1]){
                deq.removeLast();
            }
            deq.addLast(nums[i+k-1]);
            ans[i] = deq.peekFirst();
        }


        return ans;
    }
}
