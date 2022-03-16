package gameBoard;

import java.awt.*;

public class plainSquare extends square{
    public plainSquare(int x, int y)  {
        super(x, y);
        this.squareType="plain";
        this.color = Color.GREEN;
        this.crossable = true;
    }
}
