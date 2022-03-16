package Interface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import gameBoard.*;

public class boardPanel extends JPanel {

    private mainFrame mframe;
    private int squareBorderLength;

    public boardPanel(mainFrame frame) {
        super();
        this.mframe = frame;
        appModel model = mframe.getAppModel();
        ArrayList<boardSquare> squareList = model.getSquareList();
        for (int i = 0; i<squareList.size(); i++) {
            this.add(squareList.get(i));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        mframe.getAppModel().paintSquares(g);
    }
}
