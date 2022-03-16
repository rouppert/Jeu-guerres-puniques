package Interface;

import gameBoard.*;

import java.awt.*;
import java.util.*;
import gameBoard.*;

public class appModel {
    private final ArrayList<boardSquare> squareList = new ArrayList<boardSquare>();

    public appModel(board gBoard) {
        HashMap<Integer, square> squareMap = gBoard.getSquareMap();
        Iterator<Integer> i = squareMap.keySet().iterator();
        while(i.hasNext()) {
            int key = (int)i.next();
            System.out.println(key);
            boardSquare newBoardSquare = new boardSquare(squareMap.get(key));
            squareList.add(newBoardSquare);
        }
    }

    public ArrayList<boardSquare> getSquareList() {return squareList;}

    public void paintSquares(Graphics g) {
        for (boardSquare s : squareList) {
            s.paint(g);
        }
    }

}
