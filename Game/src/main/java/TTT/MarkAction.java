package TTT;

public class MarkAction {

    public void placeMark(char[][] board, String boardPositionRow,String boardPositionCol, char mark) {
        board[Integer.parseInt(boardPositionRow)][Integer.parseInt(boardPositionCol)] = mark;
    }

    public boolean canPutMark(char[][] board, String boardPositionRow, String boardPositionCol){
        return (board[Integer.parseInt(boardPositionRow)][Integer.parseInt(boardPositionCol)] == ' ' );

    }
}
