class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deq = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < ans.length; i++){
            int val = temperatures[i];
            int dec = 0;
            if(!deq.isEmpty()){
                while(!deq.isEmpty()){
                    if (deq.peekLast() < val){
                        dec++;
                        deq.removeLast();
                        while(ans[i-dec] >0){
                            dec++;
                        }
                        ans[i-dec] = dec;
                    }else{
                        break;
                    }
                }
            }
            deq.addLast(val);
            
        }

        return ans;
    }
}
