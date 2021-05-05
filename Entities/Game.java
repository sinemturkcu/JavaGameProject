package JavaKampı.Homework4_2.Entities;

public class Game {
    private int gameId;
    private String gameName;
    private String gameType;

    public Game(){

    }

    public Game(int gameId, String gameName, String gameType) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameType = gameType;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
