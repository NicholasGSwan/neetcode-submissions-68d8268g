class Solution {

    class UnionFind{

        Map<Integer,Integer> parents;
        Map<Integer, Integer> rank;

        public UnionFind(int n){
            this.parents = new HashMap<>();
            this.rank = new HashMap<>();

            for(int i= 0; i < n; i++){
                parents.put(i, i);
                rank.put(i, 1);
            }
        }

        public int findParent(int child){
            int par = parents.get(child);
            while(par != parents.get(par)){
                parents.put(par, parents.get(parents.get(par)));
                par = parents.get(par);
            }
            return par;
        }

        public boolean union(int L, int R){
            int Lpar = findParent(L);
            int Rpar = findParent(R);

            if(Lpar == Rpar){
                return false;
            }

            if(rank.get(Lpar) > rank.get(Rpar)){
                parents.put(Rpar, Lpar);
                rank.put(Lpar, rank.get(Rpar)+rank.get(Lpar));
            }else{
                parents.put(Lpar, Rpar);
                rank.put(Rpar, rank.get(Rpar)+rank.get(Lpar));
            }
            return true;
        }


    }
    public boolean validTree(int n, int[][] edges) {
        UnionFind unnie = new UnionFind(n);
        for(int[] edge: edges){
            if(!unnie.union(edge[0], edge[1])){
                return false;
            }
        }
        Set<Integer> numOfParents = new HashSet<>();
        for(int i =0; i < n; i++){
            numOfParents.add(unnie.findParent(i));
        }
        if(numOfParents.size()>1){
            return false;
        }
        return true;
    }
}
