package net.cvcg.ian.tictactoe;


/**
 * Created by Ian on 7/23/2016.
 */
public class TicTacToeBoard {
    private Player[][] board;
    public TicTacToeBoard() {
        board = new Player[3][3]; // default initial value is null
    }
    public void move(Player player, int x, int y) {
        assert player != null;
        board[x][y] = player;
    }
    public Player getWinner() {
        checkRow(0);
        checkRow(1);
        checkRow(2);
        checkColumn(0);
        checkColumn(1);
        checkColumn(2);
        return null;
    }
    public Player[][] getBoard() {
        return board;
    }

    private Player checkRow(int row) {
        if (board[0][row] != null && board[0][row] == board [1][row] && board[1][row] == board [2][row]) {
            return board[0][row];
        }
        else {return null;}
    }
    private Player checkColumn(int column) {
        if (board[column][0] != null && board[column][0] == board [column][1] && board[column][1] == board [column][1]) {
            return board[0][column];
        }
        else {return null;}
    }
}
