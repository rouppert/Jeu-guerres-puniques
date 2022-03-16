package gameBoard;


import java.awt.*;

public class square {
    protected int x;
    protected int y;
    protected String squareType;
    protected Color color;
    protected boolean crossable;

    public square(int x, int y) {
        x=x;
        y=y;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public boolean isCrossable() {return crossable;}
    public String getType() {return squareType;}
    public Color getColor() {return color;}
}
