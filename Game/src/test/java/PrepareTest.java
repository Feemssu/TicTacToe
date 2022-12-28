
import TTT.GameEnd;
import TTT.MarkAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrepareTest {

    private static char[][] testBoard() {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }

    char markO = 'O';
    char markX = 'X';

    @Nested
    @DisplayName("Player O wins tests")
    class playerO {

        @Nested
        @DisplayName("Win in horizontal row")
        class playerOWinInHorizontal {

            @Test
            void testFirstHorizontalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][0] = markO;
                testBoard[0][1] = markO;
                testBoard[0][2] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testSecondHorizontalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[1][0] = markO;
                testBoard[1][1] = markO;
                testBoard[1][2] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testThirdHorizontalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[2][0] = markO;
                testBoard[2][1] = markO;
                testBoard[2][2] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }
        }

        @Nested
        @DisplayName("Win in vertical row")
        class playerOWinInVertical {

            @Test
            void testFirstVerticalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][0] = markO;
                testBoard[1][0] = markO;
                testBoard[2][0] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testSecondVerticalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][1] = markO;
                testBoard[1][1] = markO;
                testBoard[2][1] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testThirdVerticalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][2] = markO;
                testBoard[1][2] = markO;
                testBoard[2][2] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }
        }
        @Nested
        @DisplayName("Win in diagonal row")
        class playerOWinInDiagonal {

            @Test
            void testFirstDiagonalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][0] = markO;
                testBoard[1][1] = markO;
                testBoard[2][2] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testSecondDiagonalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][2] = markO;
                testBoard[1][1] = markO;
                testBoard[2][0] = markO;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }
        }
    }



    @Nested
    @DisplayName("Player X wins tests")
    class playerX {

        @Nested
        @DisplayName("Win in horizontal row")
        class playerXWinInHorizontal {

            @Test
            void testFirstHorizontalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][0] = markX;
                testBoard[0][1] = markX;
                testBoard[0][2] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testSecondHorizontalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[1][0] = markX;
                testBoard[1][1] = markX;
                testBoard[1][2] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testThirdHorizontalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[2][0] = markX;
                testBoard[2][1] = markX;
                testBoard[2][2] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }
        }

        @Nested
        @DisplayName("Win in vertical row")
        class playerXWinInVertical {

            @Test
            void testFirstVerticalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][0] = markX;
                testBoard[1][0] = markX;
                testBoard[2][0] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testSecondVerticalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][1] = markX;
                testBoard[1][1] = markX;
                testBoard[2][1] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testThirdVerticalRow(){

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][2] = markX;
                testBoard[1][2] = markX;
                testBoard[2][2] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }
        }
        @Nested
        @DisplayName("Win in diagonal row")
        class playerXWinInDiagonal {

            @Test
            void testFirstDiagonalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][0] = markX;
                testBoard[1][1] = markX;
                testBoard[2][2] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }

            @Test
            void testSecondDiagonalRow() {

                //Given
                GameEnd gameEnd = new GameEnd();

                char[][] testBoard = testBoard();

                //When
                testBoard[0][2] = markX;
                testBoard[1][1] = markX;
                testBoard[2][0] = markX;

                //Then
                assertTrue(gameEnd.isGameEnd3x3(testBoard));
            }
        }
    }

    @Nested
    class drawAndWrongMove {

        @Test
        void testDraw(){

            //Given
            GameEnd gameEnd = new GameEnd();

            char[][] testBoard = testBoard();

            //When
            testBoard[0][0] = markX;
            testBoard[0][1] = markO;
            testBoard[0][2] = markX;
            testBoard[1][0] = markX;
            testBoard[1][1] = markO;
            testBoard[1][2] = markX;
            testBoard[2][0] = markO;
            testBoard[2][1] = markX;
            testBoard[2][2] = markO;

            //Then
            assertTrue(gameEnd.isGameEnd3x3(testBoard));
        }

        @Test
        void testWrongMove(){

            //Given
            MarkAction markAction = new MarkAction();

            char[][] testBoard = testBoard();

            //When
             testBoard[0][0] = markX;


            assertEquals(false, markAction.canPutMark(testBoard,"0","0"));
            assertTrue(markAction.canPutMark(testBoard,"2","2"));
        }
    }
}
