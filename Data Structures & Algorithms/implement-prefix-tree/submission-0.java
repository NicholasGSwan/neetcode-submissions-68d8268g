class Node {
    Map<Character, Node> children = new HashMap();
    boolean word = false;
}

class PrefixTree {
    
    Node root;


    public PrefixTree() {
         root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for(char c: word.toCharArray()){
            if(!curr.children.containsKey(c)){
                curr.children.put(c, new Node());
            }
            curr = curr.children.get(c);
        }
        curr.word = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for(char c: word.toCharArray()){
            if(!curr.children.containsKey(c)){
                return false;
            }
            curr = curr.children.get(c);
        }  
        return curr.word;
    }

    public boolean startsWith(String prefix) {
                Node curr = root;
        for(char c: prefix.toCharArray()){
            if(!curr.children.containsKey(c)){
                return false;
            }
            curr = curr.children.get(c);
        }
        return true;  
    }
}
