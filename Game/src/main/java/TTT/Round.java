package TTT;

import java.util.Scanner;


public class Round {
    InGame inGame = new InGame();
    public void round3x3(Scanner scanner) {

        char[][] board = BoardAction.makeBoard(3);
        System.out.println("If you wanna play with friend press [F] or with computer press [C]");
        String chooseGamemode;
        while(true) {
            chooseGamemode = scanner.nextLine().toUpperCase();
            if (chooseGamemode.equals("F")) {
                inGame.gameWithFriend(scanner, board);
                break;
            } else if (chooseGamemode.equals("C")) {
                inGame.gameWithComputer(scanner, board);
                break;
            } else {
                System.out.println("You choose bad key, try again");
            }
        }
    }



    public void round10x10(Scanner scanner){

        char[][] board = BoardAction.makeBoard(10);
        System.out.println("You started game 10x10 with friend");
        inGame.gameWithFriend10x10(scanner, board);
    }
}
