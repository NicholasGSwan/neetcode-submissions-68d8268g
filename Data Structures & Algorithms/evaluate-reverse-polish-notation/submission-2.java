class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> deq = new ArrayDeque<>();


        for(int i = 0; i < tokens.length; i++){
            String t = tokens[i];
            if(t.equals("+") || t.equals("-")|| t.equals("*")|| t.equals("/")){
                int b = deq.removeLast();
                int a = deq.removeLast();
                int c = evaluate(a, b, t);
                deq.addLast(c);
            }else{
                deq.addLast(Integer.parseInt(t));
                System.out.println(deq.size());
            }
        }
        return deq.peekFirst();
        
    }

    public int evaluate(int a, int b, String op){
            switch (op) {
                case "+":
                    return a+b;

                case "-":
                    return a-b;

                case "*":
                    return a*b;

                case "/":
                    return a/b;

                default:
                    return 0;
            }
    }
}
