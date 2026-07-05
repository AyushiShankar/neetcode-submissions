class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < board.length; row += 3) {
    for (int col = 0; col < board[row].length; col += 3) { 

        HashSet<Character> set = new HashSet<>();

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                char ch = board[i][j];

                if (ch == '.') continue;

                if (set.contains(ch))
                    return false;

                set.add(ch);
            }
        }
    }
}
return true;
        
    }
}
