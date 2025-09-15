package LowLevelDesignQuestions.TicTacToe;

import LowLevelDesignQuestions.TicTacToe.Model.*;

import java.util.*;

public class TicTacToeGame {
    Deque<Players> playersList;
    Board board;

    TicTacToeGame(){
        playersList =new LinkedList<>();
        initializeGame();
    }
    private void initializeGame(){
//        Creating 2 player
        Players players1 =new Players("1", new PlayingPieceX());
        Players players2 =new Players("2",new PlayingPieceO());
        playersList.add(players1);
        playersList.add(players2);
        board =new Board(3);
    }

    public String startGame() {
        System.out.println("Game Started");
        boolean noWinner =true;
        while (noWinner) {
            Players currentPlayer = playersList.removeFirst();
            board.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = board.getFreeCells();
            if(freeSpaces.size()==0){
                noWinner=false;
                continue;
            }
            System.out.print("Player :" + currentPlayer.getPlayerName() + "Enter your move (row,col): ");
            Scanner inputScanner = new Scanner(System.in);
            String s =inputScanner.nextLine();
            String[] arr =s.split(",");
            int row =Integer.parseInt(arr[0]);
            int col =Integer.parseInt(arr[1]);

            boolean piecePlaced = board.addPiece(row, col,currentPlayer.getPlayingPiece());
            if(!piecePlaced){
                System.out.println("Invalid Move Try Again");
                playersList.addFirst(currentPlayer);
                continue;
            }
            playersList.addLast(currentPlayer);
            boolean isWin = board.isWin(row,col,currentPlayer.getPlayingPiece().pieceType);
            if(isWin){
                return currentPlayer.getPlayerName();
            }
        }
        return "tie";
    }

}
