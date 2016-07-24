package net.cvcg.ian.tictactoe;

/**
 * Created by Ian on 7/23/2016.
 */
public class TicTacToeBoard {
    private Player[][] board;
    public TicTacToeBoard() {
        board = new Player[3][3];
    }
    public void move(Player player, int x, int y) {
        assert player != Player.NONE;
        board[x][y] = player;
    }
    public Player getWinner() {
        return Player.X;
    }
    public Player[][] getBoard() {
        return board;
    }
}
