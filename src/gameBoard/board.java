package gameBoard;

import java.util.HashMap;


public class board {
    private int rowNumber;
    private int columnNumber;
    private HashMap<Integer, square> squareMap;

    public int getRowNumber() {return rowNumber;}
    public int getColumnNumber() {return columnNumber;}
    public HashMap<Integer, square> getSquareMap() {return squareMap;}

    public board(int rowNumber, int columnNumber)  {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.squareMap = new HashMap<Integer, square>();
    }

    public int getLength() {
        return squareMap.size();
    }

    public void addSquare(String squareType, int x, int y) {
        int number = x*(rowNumber-1) + y;
        square Square = null;
        if (squareType == "mountain") {
            Square = new mountainSquare(x, y);
        }
        else if (squareType == "plain") {
            Square = new plainSquare(x, y);
        }
        squareMap.put(number, Square);
    }
}
