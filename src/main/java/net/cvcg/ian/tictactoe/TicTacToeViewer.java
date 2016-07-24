package net.cvcg.ian.tictactoe;

/**
 * Created by Ian on 7/24/2016.
 */
import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer
{
    private JFrame frame;
    private TicTacToeBoard board;
    public TicTacToeViewer(TicTacToeBoard board) {
        this.board = board;
        frame = new JFrame();

        frame.setSize(495, 515);
        frame.setTitle("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void refresh() {
        SwingUtilities.updateComponentTreeUI(frame);
        TicTacToeComponent component1 = new TicTacToeComponent();
        component1.setBoard(board);
        frame.add(component1);
    }
}