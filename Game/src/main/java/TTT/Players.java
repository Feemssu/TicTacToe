package TTT;

import java.util.Scanner;

public class Players {
    Move move = new Move();
    public void playerO(Scanner scanner, char[][] board) {
        char mark = 'O';
        System.out.println("Player O, please make your move.");
        move.move(scanner, board, mark);
    }

    public void playerX(Scanner scanner, char[][] board) {
        char mark = 'X';
        System.out.println("Player X, please make your move.");
        move.move(scanner, board, mark);
    }
}
