package TTT;

public class BoardAction {

    public static char[][] makeBoard(int x) {
        char[][] board = new char[x][x];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = ' ';
            }
        }
        return board;
    }
    public static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            System.out.print("\t " + i);
        }
        System.out.println();
        for(int i = 0; i < board.length; i++){
            System.out.println("\t" + "-".repeat(board.length*4));
            System.out.print(i +" \t");
            for(int j = 0; j < board[i].length; j++){

                System.out.print( "|" + board[i][j] + "|\t");

            }
            System.out.println();
        }
    }

}
