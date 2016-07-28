package net.cvcg.ian.tictactoe;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

/*
 * @author ian, @date 7/23/16 4:56 PM
 */
public class TicTacToe {
    public static boolean turn = true;

    public static void main(String[] args) throws InterruptedException {
        TicTacToeBoard board = new TicTacToeBoard();
        TicTacToeViewer viewer = new TicTacToeViewer(board);
        while (true) {

            if (board.getWinner() == Player.X) {
                int reply = JOptionPane.showConfirmDialog(null, "You Won! Play Again?", "Play Again?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    turn = true;
                    board.cleanBoard();
                }
                else {
                    System.exit(0);
                }
            }
            else if (board.getWinner() == Player.O) {
                int reply = JOptionPane.showConfirmDialog(null, "You Lost... Play Again?", "Play Again?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    turn = true;
                    board.cleanBoard();
                }
                else {
                    System.exit(0);
                }
            }
            else if (board.checkSpaces()) {
                int reply = JOptionPane.showConfirmDialog(null, "Draw... Play Again?", "Play Again?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    turn = true;
                    board.cleanBoard();
                }
                else {
                    System.exit(0);
                }
            }
            else if (turn) {
                viewer.refresh();
            }
            else if (!turn){
                TimeUnit.SECONDS.sleep(1);
                board.nextMoveAI();
                viewer.refresh();
                turn = true;
            }

        }
    }

}
