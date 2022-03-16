package Interface;

import gameBoard.*;

import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {
    private board gBoard;
    private boardPanel bPanel;
    private appModel model;

    public appModel getAppModel() {return model;}

    public board getGameBoard() {return gBoard;}

    public mainFrame() {
        super("Fenêtre principale");
        gBoard = new board(2, 2);
        gBoard.addSquare("mountain", 0, 0);
        gBoard.addSquare("plain", 0, 1);
        gBoard.addSquare("mountain", 1, 1);
        gBoard.addSquare("plain", 1, 0);
        System.out.println(gBoard.getLength());
        model = new appModel(gBoard);
        bPanel = new boardPanel(this);
        this.setSize(400, 400);
        this.setTitle("test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(bPanel);
        System.out.println("done");
        repaint();
        bPanel.setVisible(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame f = new mainFrame();
    }
}
