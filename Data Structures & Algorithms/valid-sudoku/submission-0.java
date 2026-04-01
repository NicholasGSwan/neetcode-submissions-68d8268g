class Solution {
    public boolean isValidSudoku(char[][] board) {
        //rows
        for (char[] row: board){
            Set<Character> set = new HashSet<>();
            for (char c : row){
                if (c != '.' && !set.add(c)){
                    return false;
                }
            }
        }

        //columns
        for(int c = 0; c < board[0].length; c++){
            Set<Character> set = new HashSet<>();
            for(int r = 0; r < board.length; r++){

                char ch = board[r][c];
                if (ch != '.' && !set.add(ch)){
                    return false;
                }
            }
        }

        //squares
        for(int sp = 0; sp < board.length; sp = sp+3){

            for(int vp = 0; vp < board.length; vp = vp+3){
                Set<Character> set = new HashSet<>();
                for(int c = sp; c < sp+3; c++){
                    for(int r = vp; r < vp+3; r++){
                        char ch = board[r][c];
                if (ch != '.' && !set.add(ch)){
                    return false;
                }
                    }
                }


            }
        }

        return true;
        
    }
}
