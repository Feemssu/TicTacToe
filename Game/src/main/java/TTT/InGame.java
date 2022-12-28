package TTT;

import java.util.Scanner;

public class InGame {

   Players players = new Players();
   Computer computer = new Computer();
   GameEnd gameEnd = new GameEnd();
    public void gameWithComputer(Scanner scanner, char[][] board){
        BoardAction.printBoard(board);

        while(true){
            players.playerX(scanner, board);
            if(gameEnd.isGameEnd3x3(board)){
                break;
            }
            BoardAction.printBoard(board);
            computer.computerMove(board);
            if(gameEnd.isGameEnd3x3(board)){
                break;
            }
            BoardAction.printBoard(board);
        }
    }

    public void gameWithFriend(Scanner scanner, char[][] board) {
        BoardAction.printBoard(board);


        while(true){
            players.playerX(scanner, board);
            if(gameEnd.isGameEnd3x3(board)){
                break;
            }
            BoardAction.printBoard(board);
            players.playerO(scanner, board);
            if(gameEnd.isGameEnd3x3(board)){
                break;
            }
            BoardAction.printBoard(board);
        }
    }

    public void gameWithFriend10x10(Scanner scanner, char[][] board) {
        BoardAction.printBoard(board);


        while(true){
            players.playerX(scanner, board);
            if(gameEnd.isGameEnd10x10(board)){
                break;
            }
            BoardAction.printBoard(board);
            players.playerX(scanner, board);
            if(gameEnd.isGameEnd10x10(board)){
                break;
            }
            BoardAction.printBoard(board);
        }
    }
}
