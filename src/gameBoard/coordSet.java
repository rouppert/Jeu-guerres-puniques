package gameBoard;

public class coordSet {

    private int x;
    private int y;

    public coordSet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setCoordinates (int x, int y)  {
        this.setX(x);
        this.setY(y);
    }

    public boolean isEqual(coordSet secondSet) {
        if (this.getX() == secondSet.getX() & this.getY() == secondSet.getY()) {
            return true;
        }
        else {return false;}
    }
}
