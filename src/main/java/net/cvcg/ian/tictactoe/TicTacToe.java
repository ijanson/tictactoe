package net.cvcg.ian.tictactoe;
import java.util.Scanner;

/*
 * @author ian, @date 7/23/16 4:56 PM
 */
public class TicTacToe {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args)
    {
        Scanner kBoard = new Scanner(System.in);
        TicTacToeBoard board = new TicTacToeBoard();
        TicTacToeViewer viewer = new TicTacToeViewer(board);
        viewer.refresh();
        while (true) {
            int move = kBoard.nextInt();
            System.out.println();
            int move2 = kBoard.nextInt();
            System.out.println();
            board.move(Player.O, move, move2);
            viewer.refresh();
        }
    }

}
