package TTT;

import java.util.Scanner;

public class BeginGame {

    Round round = new Round();

    public void run(){
        Scanner scanner = new Scanner(System.in);

        startGame(scanner, round);
    }

    private void startGame(Scanner scanner, Round round){
        System.out.println("Hello, choose board size: \n" +
                "[N] 3x3, you can play with friend or with computer \n" +
                "[B] 10x10, you can play only with friend");
        String chooseBoardSize;
        while(true){
            chooseBoardSize = scanner.nextLine().toUpperCase();
            if(chooseBoardSize.equals("N")){
                round.round3x3(scanner);
                break;
            }else if(chooseBoardSize.equals("B")){
                round.round10x10(scanner);
                break;
            }else{
                System.out.println("You choose bad key, try again");
            }
        }
    }

}
