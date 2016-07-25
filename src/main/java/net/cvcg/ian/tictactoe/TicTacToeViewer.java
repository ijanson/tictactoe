package net.cvcg.ian.tictactoe;

/**
 * Created by Ian on 7/24/2016.
 */
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.*;

public class TicTacToeViewer
{
    private JFrame frame;
    private TicTacToeBoard board;
    private Player[][] boardArray;
    class MousePressListener implements MouseListener {
        public void mousePressed(MouseEvent event) {
            int x = event.getX();
            int y = event.getY();
            if (x >= 0 && x <= 165 && y >= 0 && y <= 185 && boardArray[0][0] == null && TicTacToe.turn) {
                board.move(Player.X, 0, 0);
                TicTacToe.turn = false;
            }
            else if (x >= 170 && x <= 325 && y >= 0 && y <= 185 && boardArray[1][0] == null && TicTacToe.turn) {
                board.move(Player.X, 1, 0);
                TicTacToe.turn = false;
            }
            else if (x >= 325 && x <= 495 && y >= 0 && y <= 185 && boardArray[2][0] == null && TicTacToe.turn) {
                board.move(Player.X, 2, 0);
                TicTacToe.turn = false;
            }
            else if (x >= 0 && x <= 165 && y >= 190 && y <= 345 && boardArray[0][1] == null && TicTacToe.turn) {
                board.move(Player.X, 0, 1);
                TicTacToe.turn = false;
            }
            else if (x >= 170 && x <= 325 && y >= 190 && y <= 345 && boardArray[1][1] == null && TicTacToe.turn) {
                board.move(Player.X, 1, 1);
                TicTacToe.turn = false;
            }
            else if (x >= 330 && x <= 495 && y >= 190 && y <= 345 && boardArray[2][1] == null && TicTacToe.turn) {
                board.move(Player.X, 2, 1);
                TicTacToe.turn = false;
            }
            else if (x >= 0 && x <= 165 && y >= 350 && y <= 505 && boardArray[0][2] == null && TicTacToe.turn) {
                board.move(Player.X, 0, 2);
                TicTacToe.turn = false;
            }
            else if (x >= 170 && x <= 325 && y >= 350 && y <= 505 && boardArray[1][2] == null && TicTacToe.turn) {
                board.move(Player.X, 1, 2);
                TicTacToe.turn = false;
            }
            else if (x >= 330 && x <= 495 && y >= 350 && y <= 505 && boardArray[2][2] == null && TicTacToe.turn) {
                board.move(Player.X, 2, 2);
                TicTacToe.turn = false;
            }
        }
        // Do-nothing methods
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    public TicTacToeViewer(TicTacToeBoard board) {
        this.board = board;
        boardArray = board.getBoard();
        frame = new JFrame();

        frame.setSize(495, 515);
        frame.setTitle("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        MouseListener listener = new MousePressListener();
        frame.addMouseListener(listener);
    }

    public void refresh() {
        SwingUtilities.updateComponentTreeUI(frame);
        TicTacToeComponent component1 = new TicTacToeComponent();
        component1.setBoard(board);
        frame.add(component1);
    }
}