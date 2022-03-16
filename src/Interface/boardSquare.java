package Interface;

import gameBoard.*;
import javax.swing.*;
import java.awt.*;

public class boardSquare extends JComponent {
    private int x;
    private int y;
    private Color color;
    private int borderLength = 200;
    square matchingSquare;

    public boardSquare(square matchingSquare) {
        matchingSquare = matchingSquare;
        x = matchingSquare.getX();
        y = matchingSquare.getY();
        color = matchingSquare.getColor();
        String type = matchingSquare.getType();
    }

    public square getMatchingSquare() {return matchingSquare;}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("painted");
        System.out.println(x);
        System.out.println(y);
        g.setColor(color);
        g.fillRect(x*borderLength, y*borderLength, borderLength, borderLength);
    }
}
