public class Board {
    char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    void printBoard(){
        for(char[] row : board){
            for(char cell : row){
                System.out.print(cell + "");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int x, int y, char symbol) {
        if (x >= 0 && x < 3 && y >= 0 && y < 3 && board[y][x] == '-') {
            board[y][x] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;
        return false;
    }

    public boolean isFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '-') return false;
            }
        }
        return true;
    }
}
