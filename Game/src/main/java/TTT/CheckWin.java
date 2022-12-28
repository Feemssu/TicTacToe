package TTT;

public class CheckWin {

    public boolean checkWin3x3(char[][] board, char mark){
        //horizontal and vertical
        for(int i = 0; i < 3; i++){
            if(
                    (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) ||
                    (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark)){
                return true;
            }
        }
        //diagonal
        if(
                (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark ) ||
                        (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark )){
            return true;
        }
        return false;
    }

    public boolean checkWin10x10(char[][] board, char mark){
        // horizontal and vertical
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 6; j++) {
                if ((board[i][j] == mark && board[i][j+1] == mark && board[i][j+2] == mark && board[i][j+3] == mark && board[i][j+4] == mark) ||
                        (board[j][i] == mark && board[j+1][i] == mark && board[j+2][i] == mark && board[j+3][i] == mark && board[j+4][i] == mark)) {
                    return true;
                }
            }
        }

        // 1st diagonal
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((board[i][j] == mark && board[i+1][j+1] == mark && board[i+2][j+2] == mark && board[i+3][j+3] == mark && board[i+4][j+4] == mark)){
                    return true;
                }
            }
        }

        // 2nd diagonal
        for(int i = 0; i < 6; i++){
            for(int j = 9; j > 3; j--){
                if((board[i][j] == mark && board[i+1][j-1] == mark && board[i+2][j-2] == mark && board[i+3][j-3] == mark && board[i+4][j-4] == mark)){
                    return true;
                }
            }
        }
        return false;
    }
}
