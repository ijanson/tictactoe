package net.cvcg.ian.tictactoe;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeBoardTest {

    @Test
    public void testMove() {
        TicTacToeBoard board = new TicTacToeBoard();
        board.move(Player.X, 0, 0);
        assertTrue(board.getBoard()[0][0] == Player.X);
    }

    @Ignore
    @Test(expected=IllegalArgumentException.class)
    public void testCannotMoveOverOtherPlayer() {
        TicTacToeBoard board = new TicTacToeBoard();
        board.move(Player.O, 0, 0);
        board.move(Player.X, 0, 0);
    }

    @Ignore
    @Test(expected=IllegalArgumentException.class)
    public void testOMovesCannotExceedXMoves() {
        TicTacToeBoard board = new TicTacToeBoard();
        board.move(Player.O, 0, 0);
    }

    @Test
    public void testGetWinnerInColumn() {
        TicTacToeBoard board = new TicTacToeBoard();
        setupBoardForOColumnWin(board);
        board.move(Player.O, 1, 2);
        assertTrue(board.getWinner() == Player.O);
    }

    private void setupBoardForOColumnWin(TicTacToeBoard board) {
        board.move(Player.X, 0, 0);
        board.move(Player.O, 1, 0);
        board.move(Player.X, 0, 2);
        board.move(Player.O, 1, 1);
        board.move(Player.X, 2, 0);
    }


    @Test
    public void testAIWinsWithNextColumnMoveIfAvailable() {
        TicTacToeBoard board = new TicTacToeBoard();
        setupBoardForOColumnWin(board);
        board.nextMoveAI();
        assertTrue(board.getWinner() == Player.O);
    }

    @Test
    public void testGetWinnerInRow() {
        TicTacToeBoard board = new TicTacToeBoard();
        board.move(Player.X, 0, 2);
        board.move(Player.O, 0, 1);
        board.move(Player.X, 1, 2);
        board.move(Player.O, 1, 1);
        board.move(Player.X, 2, 2);
        assertTrue(board.getWinner() == Player.X);
    }

    @Test
    public void testGetWinnerInDiagonal() {
        TicTacToeBoard board = new TicTacToeBoard();
        setupBoardForODiagonalWin(board);
        board.move(Player.O, 2, 2);
        assertTrue(board.getWinner() == Player.O);
    }

    @Test
    public void testAIWinsWithNextDiagonalMoveIfAvailable() {
        TicTacToeBoard board = new TicTacToeBoard();
        setupBoardForODiagonalWin(board);
        board.nextMoveAI();
        assertTrue(board.getWinner() == Player.O);
    }


    private void setupBoardForODiagonalWin(TicTacToeBoard board) {
        board.move(Player.X, 0, 2);
        board.move(Player.O, 0, 0);
        board.move(Player.X, 1, 2);
        board.move(Player.O, 1, 1);
        board.move(Player.X, 2, 1);
    }


}
