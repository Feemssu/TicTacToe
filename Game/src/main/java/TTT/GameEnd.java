package TTT;

public class GameEnd {
    CheckWin checkWin = new CheckWin();
    public boolean isGameEnd3x3(char[][] board){

        return isEnd(checkWin.checkWin3x3(board, 'X'), board, checkWin.checkWin3x3(board, 'O'));
    }

    public boolean isGameEnd10x10(char[][] board){
        return isEnd(checkWin.checkWin10x10(board, 'X'), board, checkWin.checkWin10x10(board, 'O'));
    }

    private boolean isEnd(boolean checkWinX, char[][] board, boolean checkWinO) {

        if(checkWinX){
            BoardAction.printBoard(board);
            System.out.println("Player X won");
            return true;
        }

        if(checkWinO){
            BoardAction.printBoard(board);
            System.out.println("Player O won");
            return true;
        }

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        BoardAction.printBoard(board);
        System.out.println("Tie");
        return true;
    }


}
