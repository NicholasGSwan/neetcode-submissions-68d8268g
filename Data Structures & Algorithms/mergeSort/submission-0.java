// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergeSort(pairs, 0, pairs.size()-1);
    }

    public List<Pair> mergeSort(List<Pair> pairs, int start, int end){
        if(end-start +1 <= 1){
            return pairs;
        }

        int mid = start + ((end-start)/2);
        mergeSort(pairs, start, mid);
        mergeSort(pairs, mid+1, end);

        return merge(pairs, start, end, mid);
    }

    public List<Pair> merge(List<Pair> pairs, int start, int end, int mid){
        int L = 0;
        int R = 0;
        int sort = start;
        List<Pair> leftSide = new ArrayList<>(pairs.subList(start, mid+1));
        List<Pair> rightSide = new ArrayList<>(pairs.subList(mid+1, end+1));

        while(L < leftSide.size() && R < rightSide.size()){
            if(leftSide.get(L).key <= rightSide.get(R).key){
                pairs.set(sort, leftSide.get(L));
                L++;
            }else{
                pairs.set(sort, rightSide.get(R));
                R++;
            }
            sort++;
        }

        while(L < leftSide.size()){
            pairs.set(sort, leftSide.get(L));
                L++;
                sort++;
        }

        while(R< rightSide.size()){
            pairs.set(sort, rightSide.get(R));
            R++;
            sort++;
        }
        return pairs;
    }
}
