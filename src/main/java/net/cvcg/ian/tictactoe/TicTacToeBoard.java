package net.cvcg.ian.tictactoe;


import java.util.Random;

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
    public void cleanBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = null;
            }
        }
    }
    public boolean checkSpaces() {
        int nullCounter = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    nullCounter++;
                }
            }
        }
        if (nullCounter == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public Player getWinner() {
        Player player = checkRow(0);
        if (player ==  null) {player = checkRow(1);}
        if (player ==  null) {player = checkRow(2);}
        if (player ==  null) {player = checkColumn(0);}
        if (player ==  null) {player = checkColumn(1);}
        if (player ==  null) {player = checkColumn(2);}
        if (player == null) {if (board[0][0] != null && board[0][0] == board [1][1] && board[1][1] == board [2][2]) {player = board[0][0];}}
        if (player == null) {if (board[0][2] != null && board[0][2] == board [1][1] && board[1][1] == board [2][0]) {player = board[0][2];}}
        return player;
    }
    public Player[][] getBoard() {
        return board;
    }

    public void nextMoveAI() {
        if (checkForWinningRow(0, Player.O) != -1) {
            move(Player.O, checkForWinningRow(0, Player.O), 0);
            return;
        }
        else if (checkForWinningRow(1, Player.O) != -1) {
            move(Player.O, checkForWinningRow(1, Player.O), 1);
            return;
        }
        else if (checkForWinningRow(2, Player.O) != -1) {
            move(Player.O, checkForWinningRow(2, Player.O), 2);
            return;
        }
        else if (checkForWinningColumn(0, Player.O) != -1) {
            move(Player.O, 0, checkForWinningColumn(0, Player.O));
            return;
        }
        else if (checkForWinningColumn(1, Player.O) != -1) {
            move(Player.O, 1, checkForWinningColumn(1, Player.O));
            return;
        }
        else if (checkForWinningColumn(2, Player.O) != -1) {
            move(Player.O, 2, checkForWinningColumn(2, Player.O));
            return;
        }
        else if (board[0][0] == board [1][1] && board[2][2] == null && board[0][0] == Player.O){
            move(Player.O, 2, 2);
            return;
        }
        else if (board[1][1] == board [2][2] && board[0][0] == null && board[1][1] == Player.O){
            move(Player.O, 0, 0);
            return;
        }
        else if (board[0][0] == board [2][2] && board[1][1] == null && board[0][0] == Player.O){
            move(Player.O, 1, 1);
            return;
        }
        else if (board[0][2] == board [1][1] && board[2][0] == null && board[0][2] == Player.O){
            move(Player.O, 2, 0);
            return;
        }
        else if (board[1][1] == board [2][0] && board[0][2] == null && board[1][1] == Player.O){
            move(Player.O, 0, 2);
            return;
        }
        else if (board[0][2] == board [2][0] && board[1][1] == null && board[0][2] == Player.O){
            move(Player.O, 1, 1);
            return;
        }
        else if (checkForWinningRow(0, Player.X) != -1) {
            move(Player.O, checkForWinningRow(0, Player.X), 0);
            return;
        }
        else if (checkForWinningRow(1, Player.X) != -1) {
            move(Player.O, checkForWinningRow(1, Player.X), 1);
            return;
        }
        else if (checkForWinningRow(2, Player.X) != -1) {
            move(Player.O, checkForWinningRow(2, Player.X), 2);
            return;
        }
        else if (checkForWinningColumn(0, Player.X) != -1) {
            move(Player.O, 0, checkForWinningColumn(0, Player.X));
            return;
        }
        else if (checkForWinningColumn(1, Player.X) != -1) {
            move(Player.O, 1, checkForWinningColumn(1, Player.X));
            return;
        }
        else if (checkForWinningColumn(2, Player.X) != -1) {
            move(Player.O, 2, checkForWinningColumn(2, Player.X));
            return;
        }
        else if (board[0][0] == board [1][1] && board[2][2] == null && board[0][0] == Player.X){
            move(Player.O, 2, 2);
            return;
        }
        else if (board[1][1] == board [2][2] && board[0][0] == null && board[1][1] == Player.X){
            move(Player.O, 0, 0);
            return;
        }
        else if (board[0][0] == board [2][2] && board[1][1] == null && board[0][0] == Player.X){
            move(Player.O, 1, 1);
            return;
        }
        else if (board[0][2] == board [1][1] && board[2][0] == null && board[0][2] == Player.X){
            move(Player.O, 2, 0);
            return;
        }
        else if (board[1][1] == board [2][0] && board[0][2] == null && board[1][1] == Player.X){
            move(Player.O, 0, 2);
            return;
        }
        else if (board[0][2] == board [2][0] && board[1][1] == null && board[0][2] == Player.X){
            move(Player.O, 1, 1);
            return;
        }
        else {
            while (true) {
                int i = generateRandomSpace();
                int j = generateRandomSpace();
                if (board[i][j] == null) {
                    move(Player.O, i, j);
                    return;
                }
            }
        }
    }

    private int checkForWinningRow(int row, Player player) {
        if (board[0][row] == board [1][row] && board[2][row] == null && board[0][row] == player){
            return 2;
        }
        if (board[1][row] == board [2][row] && board[0][row] == null && board[1][row] == player){
            return 0;
        }
        if (board[0][row] == board [2][row] && board[1][row] == null && board[0][row] == player){
            return 1;
        }
        else {return  -1;}
    }

    private int generateRandomSpace() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    private int checkForWinningColumn(int column, Player player) {
        if (board[column][0] == board [column][1] && board[column][2] == null && board[column][0] == player){
            return 2;
        }
        if (board[column][1] == board [column][2] && board[column][0] == null && board[column][1] == player){
            return 0;
        }
        if (board[column][0] == board [column][2] && board[column][1] == null && board[column][0] == player){
            return 1;
        }
        else {return  -1;}
    }

    private Player checkRow(int row) {
        if (board[0][row] != null && board[0][row] == board [1][row] && board[1][row] == board [2][row]) {
            return board[0][row];
        }
        else {return null;}
    }
    private Player checkColumn(int column) {
        if (board[column][0] != null && board[column][0] == board [column][1] && board[column][1] == board [column][2]) {
            return board[column][0];
        }
        else {return null;}
    }
}
