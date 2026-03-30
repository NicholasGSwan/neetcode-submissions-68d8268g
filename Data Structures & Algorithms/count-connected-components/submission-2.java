class Solution {


    class Union{
        Map<Integer,Integer> parents;
        Map<Integer, Integer> rank;

        public Union(int numOfNodes){
            parents = new HashMap<>();
            rank = new HashMap<>();
            for(int i = 0; i<numOfNodes; i++){
                parents.put(i, i);
                rank.put(i, 1);
            }
        }

        public int findParent(int node){
            int par = parents.get(node);
            while(par != parents.get(par)){
                parents.put(node, parents.get(parents.get(par)));
                par = parents.get(par);
            }
            return par;
        }

        public boolean unionNodes(int L, int R){
            int Lpar = findParent(L);
            int Rpar = findParent(R);
            if(Lpar == Rpar){
                return false;
            }
            if(rank.get(Lpar) > rank.get(Rpar)){
                parents.put(Rpar, Lpar);
                rank.put(Lpar, rank.get(Lpar)+rank.get(Rpar));
            }else{
                parents.put(Lpar, Rpar);
                rank.put(Rpar, rank.get(Lpar)+rank.get(Rpar));
            }
            return true;
        }

        public boolean areUnioned(int L, int R){
            if(findParent(L) != findParent(R)){
                return false;
            }
            return true;
        }
        
    }

    public int countComponents(int n, int[][] edges) {
        Union unnie = new Union(n);

        for(int[] edge: edges){
            unnie.unionNodes(edge[0], edge[1]);
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(unnie.findParent(i));
        }
        return set.size();

    }
}
