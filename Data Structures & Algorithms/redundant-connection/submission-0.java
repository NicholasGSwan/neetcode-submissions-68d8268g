class Solution {
    class UnionFind{
        Map<Integer, Integer> parents;
        Map<Integer, Integer> rank;

        public UnionFind(int n){
            this.parents = new HashMap<>();
            this.rank = new HashMap<>();
            for(int i = 1; i <= n; i++){
                parents.put(i, i);
                rank.put(i, 1);
            }
        }

        public int findParent(int n){
            int parent = parents.get(n);
            while(parent != parents.get(parent)){
                parents.put(parent, parents.get(parents.get(parent)));
                parent = parents.get(parent);
            }
            return parent;
        }

        public boolean union(int left, int right){
            left = this.findParent(left);
            right = this.findParent(right);
            if(left == right){
                return false;
            }
            

            if(rank.get(left) > rank.get(right)){
                parents.put(right, left);
                rank.put(left, rank.get(left) + rank.get(right));
            }else{
                parents.put(left, right);
                rank.put(right, rank.get(right) +rank.get(left));
            }
            return true;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        UnionFind find = new UnionFind(n);
        int[] answer = new int[2];
        for(int[] edge: edges){
            if(!find.union(edge[0], edge[1])){
                answer[0] = edge[0];
                answer[1] = edge[1];
            }
        }
        return answer;
    }
}
