package Board;
import Pieces.*;

public class Board {
    //board object is composed by 64 square objects
    Square[][] squares = new Square[8][8];

    //constructor
    public Board()
    {
        this.startBoard();
    }

    //getter
    public Square getSquare(int row, int col) throws Exception {
        if((row < 0 || row > 7) || (col < 0 || col > 7)){
            throw new Exception("Square's index is out of bounds");
        }

        return squares[row][col];
    }

    //methods
    public void startBoard(){
        //keep in mind board is viewed from white's perspective where a1 = [0,0]

        //white (1 row)
        squares[0][0] = new Square(0, 0, new Rook(/*TODO*/));
        squares[0][1] = new Square(0, 1, new Knight(/*TODO*/));
        squares[0][2] = new Square(0, 2, new Bishop(/*TODO*/));
        squares[0][3] = new Square(0, 3, new Queen(/*TODO*/));
        squares[0][4] = new Square(0, 4, new King(/*TODO*/));
        squares[0][5] = new Square(0, 5, new Bishop(/*TODO*/));
        squares[0][6] = new Square(0, 6, new Knight(/*TODO*/));
        squares[0][7] = new Square(0, 7, new Rook(/*TODO*/));

        //white (2 row)
        for(int i=0; i<8; i++){
            squares[1][i] = new Square(1,i,new Pawn(/*TODO*/));
        }

        //empty (3 - 5 rows)
        for(int i=2; i<6; i++){
            for(int j=0; j<8; j++){
                squares[i][j] = new Square(i, j, null);
            }
        }

        //black (1 row)
        squares[7][0] = new Square(7, 0, new Rook(/*TODO*/));
        squares[7][1] = new Square(7, 1, new Knight(/*TODO*/));
        squares[7][2] = new Square(7, 2, new Bishop(/*TODO*/));
        squares[7][3] = new Square(7, 3, new Queen(/*TODO*/));
        squares[7][4] = new Square(7, 4, new King(/*TODO*/));
        squares[7][5] = new Square(7, 5, new Bishop(/*TODO*/));
        squares[7][6] = new Square(7, 6, new Knight(/*TODO*/));
        squares[7][7] = new Square(7, 7, new Rook(/*TODO*/));

        //black (2 row)
        for(int i=0; i<8; i++){
            squares[6][i] = new Square(6,i,new Pawn(/*TODO*/));
        }
    }
}
