package Board;
import Pieces.*;

//square is the unit of space in chess game
//there is 2 good approaches for GUI of square object:
//  1- change object's piece content and refresh GUI
//  2- delete the square object and create new one every time change occurs
//im going for approach 2, because it looks easier to implement in GUI, even though 1 is better in a resource managing perspective

public class Square {
    private Piece piece;
    private int row;
    private int col;

    //constructor
    public Square(int _row, int _col, Piece _piece){
        this.setRow(_row);
        this.setCol(_col);
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
    public void setRow(int _row){
        this.row = _row;
    }

    public int getRow() {
        return row;
    }
    //yPos
    public void setCol(int _col) {
        this.col = _col;
    }

    public int getCol() {
        return col;
    }
}
