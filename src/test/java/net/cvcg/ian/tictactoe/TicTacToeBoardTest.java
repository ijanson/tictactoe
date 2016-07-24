package net.cvcg.ian.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeBoardTest {

    @Test
    public void testMove() {
        TicTacToeBoard board = new TicTacToeBoard();
        board.move(Player.X, 0, 0);
        assertTrue(board.getBoard()[0][0] == Player.X);
    }

    @Test
    public void testGetWinner() {
        TicTacToeBoard board = new TicTacToeBoard();
        board.move(Player.Y, 1, 0);
        board.move(Player.Y, 1, 1);
        board.move(Player.Y, 1, 2);
        assertTrue(board.getWinner() == Player.Y);
    }

}
