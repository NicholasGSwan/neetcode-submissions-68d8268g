class Solution {

    private static final String delim = "#";

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append(delim);
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int L = 0;
        int R = 0;
        while(R < str.length()){
            while(str.charAt(R) != '#'){
                R++;
            }
            int len = Integer.parseInt(str.substring(L, R));
            L = R+1;
            ls.add(str.substring(L, L+len));
            L = L+len;
            R = L;
        }
        return ls;
    }
}
