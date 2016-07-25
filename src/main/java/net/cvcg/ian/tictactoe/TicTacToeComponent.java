package net.cvcg.ian.tictactoe;

/**
 * Created by Ian on 7/24/2016.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.BasicStroke;
public class TicTacToeComponent extends JComponent
{
    private TicTacToeBoard board;
    private Player[][] boardArray;


    public void setBoard(TicTacToeBoard board) {
        this.board = board;
        boardArray = board.getBoard();
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        // Setup the board
        g2.setStroke(new BasicStroke(5));
        Line2D.Double line1 = new Line2D.Double(0, 160, 480, 160);
        Line2D.Double line2 = new Line2D.Double(0, 320, 480, 320);
        Line2D.Double line3 = new Line2D.Double(160, 0, 160, 480);
        Line2D.Double line4 = new Line2D.Double(320, 0, 320, 480);
        g2.setColor(Color.BLACK);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);
        drawSymbols(g2);


    }

    public void drawSymbols(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray.length; j++) {
                if (boardArray[i][j] == Player.X) {
                    if (i == 0 && j == 0) {
                        drawX(1, g2);
                    }
                    if (i == 1 && j == 0) {
                        drawX(2, g2);
                    }
                    if (i == 2 && j == 0) {
                        drawX(3, g2);
                    }
                    if (i == 0 && j == 1) {
                        drawX(4, g2);
                    }
                    if (i == 1 && j == 1) {
                        drawX(5, g2);
                    }
                    if (i == 2 && j == 1) {
                        drawX(6, g2);
                    }
                    if (i == 0 && j == 2) {
                        drawX(7, g2);
                    }
                    if (i == 1 && j == 2) {
                        drawX(8, g2);
                    }
                    if (i == 2 && j == 2) {
                        drawX(9, g2);
                    }
                }
                if (boardArray[i][j] == Player.O) {
                    if (i == 0 && j == 0) {
                        drawO(1, g2);
                    }
                    if (i == 1 && j == 0) {
                        drawO(2, g2);
                    }
                    if (i == 2 && j == 0) {
                        drawO(3, g2);
                    }
                    if (i == 0 && j == 1) {
                        drawO(4, g2);
                    }
                    if (i == 1 && j == 1) {
                        drawO(5, g2);
                    }
                    if (i == 2 && j == 1) {
                        drawO(6, g2);
                    }
                    if (i == 0 && j == 2) {
                        drawO(7, g2);
                    }
                    if (i == 1 && j == 2) {
                        drawO(8, g2);
                    }
                    if (i == 2 && j == 2) {
                        drawO(9, g2);
                    }
                }
            }
        }
    }

    private void drawX(int pos, Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (pos == 1) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(0, 0, 160, 160);
            Line2D.Double line2 = new Line2D.Double(160, 0, 0, 160);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        else if (pos == 2) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(160, 0, 320, 160);
            Line2D.Double line2 = new Line2D.Double(320, 0, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        else if (pos == 3) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(320, 0, 480, 160);
            Line2D.Double line2 = new Line2D.Double(480, 0, 320, 160);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        else if (pos == 4) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(0, 160, 160, 320);
            Line2D.Double line2 = new Line2D.Double(160, 160, 0, 320);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        else if (pos == 5) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(160, 160, 320, 320);
            Line2D.Double line2 = new Line2D.Double(320, 160, 160, 320);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        if (pos == 6) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(320, 160, 480, 320);
            Line2D.Double line2 = new Line2D.Double(480, 160, 320, 320);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        if (pos == 7) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(0, 320, 160, 480);
            Line2D.Double line2 = new Line2D.Double(160, 320, 0, 480);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        if (pos == 8) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(160, 320, 320, 480);
            Line2D.Double line2 = new Line2D.Double(320, 320, 160, 480);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
        if (pos == 9) {
            g2.setStroke(new BasicStroke(5));
            Line2D.Double line1 = new Line2D.Double(320, 320, 480, 480);
            Line2D.Double line2 = new Line2D.Double(480, 320, 320, 480);
            g2.setColor(Color.BLACK);
            g2.draw(line1);
            g2.draw(line2);
        }
    }

    private void drawO(int pos, Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (pos == 1) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 2) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(160, 0, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 3) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(320, 0, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 4) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(0, 160, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 5) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(160, 160, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 6) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(320, 160, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 7) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(0, 320, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 8) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(160, 320, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
        else if (pos == 9) {
            g2.setStroke(new BasicStroke(5));
            Ellipse2D.Double circle = new Ellipse2D.Double(320, 320, 160, 160);
            g2.setColor(Color.BLACK);
            g2.draw(circle);
        }
    }
}

