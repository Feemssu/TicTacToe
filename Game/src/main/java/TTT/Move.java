package TTT;

import java.util.Scanner;

public class Move {
    MarkAction markAction = new MarkAction();
    public void move(Scanner scanner, char[][] board, char mark) {
        String userInputRow;
        String userInputCol;

        while (true) {
            try {
                System.out.println("Choose row");
                userInputRow = scanner.nextLine();
                System.out.println("Choose column");
                userInputCol = scanner.nextLine();
                if (markAction.canPutMark(board, userInputRow, userInputCol)) {
                    break;
                } else {
                    System.out.println("You cant put here your mark, please try again");
                }

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You choose bad keys, please try again");
            }
        }
        markAction.placeMark(board, userInputRow, userInputCol, mark);
    }

}
