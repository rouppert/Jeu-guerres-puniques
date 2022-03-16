package gameBoard;

import java.awt.*;

public class mountainSquare extends square{
    public mountainSquare(int x, int y) {
        super(x, y);
        this.squareType = "mountain";
        this.color = Color.BLACK;
        this.crossable = false;
    }
}
