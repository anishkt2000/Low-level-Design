package LowLevelDesignQuestions.TicTacToe.Model;

import java.util.List;

public class Players {
    String playerName;
    PlayingPiece playingPiece;
    public Players(String playerName, PlayingPiece piece){
        this.playerName =playerName;
        this.playingPiece=piece;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

}
