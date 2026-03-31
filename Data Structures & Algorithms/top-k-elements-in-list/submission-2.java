class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();

        for (int num : nums ){
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 1001; i++){
            List<Integer> l = new ArrayList<>();
            list.add(l);
        }

        for(int key : m.keySet()){
            
            list.get(m.get(key)).add(key);
        }

        int[] ans = new int[k];
        int ai = 0;

        for (int i = list.size()-1; ai < k; i--){
            if(!list.get(i).isEmpty()){
                for (int n : list.get(i)){
                    ans[ai] = n;
                    ai++;
                }
            }
        }
        return ans;


    }
}
