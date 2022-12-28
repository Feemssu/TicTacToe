package TTT;

import java.util.Random;

public class Computer {
    MarkAction markAction = new MarkAction();
    public void computerMove(char[][] board){
        Random random = new Random();
        char mark = 'O';
        int randRow;
        int randCol;

        while(true){
            randRow = random.nextInt(3);
            randCol = random.nextInt(3);
            if(markAction.canPutMark(board, Integer.toString(randRow), Integer.toString(randCol))){
                break;
            }
        }
        System.out.println("Computer choose position row " + randRow + " and column " + randCol);
        markAction.placeMark(board, Integer.toString(randRow), Integer.toString(randCol), mark);
    }

}
