package LowLevelDesignQuestions.TicTacToe.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] !=null){
                    System.out.print(board[i][j].pieceType +" | ");
                }
                else{
                    System.out.print("  | ");
                }
            }
            System.out.println("");
        }
    }

    public int getSize(){
        return size;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(board [row][col] != null){
            return false;
        }
        board[row][col]=playingPiece;
        return true;
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells =new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] ==null){
                    freeCells.add(new Pair<>(i,j));
                }
            }
        }
        return freeCells;

    }

    public boolean isWin(int row, int col, PieceType pieceType){
        boolean rowWin =true;
        boolean colWin =true;
        boolean rightDiagonalWin =true;
        boolean leftDiagonalWin =true;

        for(int i=0;i<size;i++){
            if(board[row][i]==null || board[row][i].pieceType!=pieceType){
                rowWin =false;
            }
            if(board[i][col]==null || board[i][col].pieceType!=pieceType){
                colWin =false;
            }
            if(board[i][i]==null || board[i][i].pieceType!=pieceType){
                rightDiagonalWin =false;
            }
            if(board[i][size-i-1]==null || board[i][size-i-1].pieceType!=pieceType){
                leftDiagonalWin =false;
            }

        }
        return rowWin || colWin || rightDiagonalWin || leftDiagonalWin;

    }
}


