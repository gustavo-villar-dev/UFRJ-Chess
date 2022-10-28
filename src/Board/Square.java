package Board;
import Pieces.*;

//square is the unit of space in chess game
//there is 2 good approaches for GUI of square object:
//  1- change object's piece content and refresh GUI
//  2- delete the square object and create new one every time change occurs
//im going for approach 2, because it looks easier to implement in GUI, even though 1 is better in a resource managing perspective

public class Square {
    private Piece piece;
    private int xPos;
    private int yPos;

    //constructor
    public Square(int _xPos, int _yPos, Piece _piece){
        this.setXPos(_xPos);
        this.setYPos(_yPos);
        this.setPiece(_piece);
    }

    //methods

    //piece
    public void setPiece(Piece _piece) {
        this.piece = _piece;
    }

    public Piece getPiece() {
        return piece;
    }
    //xPos
    public void setXPos(int _xPos){
        this.xPos = _xPos;
    }

    public int getXPos() {
        return xPos;
    }
    //yPos
    public void setYPos(int _yPos) {
        this.yPos = _yPos;
    }

    public int getYPos() {
        return yPos;
    }
}
