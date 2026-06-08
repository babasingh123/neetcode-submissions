class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int i=0 ;i <9 ; i++) {
            for(int j=0; j<9 ; j++) {
                if(board[i][j]=='.') {
                    continue;
                }
                int boxnum = (i/3)*3 + (j/3);
                char ch = board[i][j];
                if(row[i].contains(ch) || col[j].contains(ch) || box[boxnum].contains(ch)) {
                    return false;
                }
                row[i].add(ch);
                col[j].add(ch);
                box[boxnum].add(ch);
            }
        }
        return true;
     }
}
