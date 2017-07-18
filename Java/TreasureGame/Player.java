package TreasureGame;

/**
 * Created by Profile on 11/05/2017.
 */
public class Player {

    private int playerPositionX;
    private int playerPositionY;

    public Player(){};



    public Player(int playerPositionX, int playerPositionY) {
        this.playerPositionX = playerPositionX;
        this.playerPositionY = playerPositionY;
    }

    public int getPlayerPositionX() {
        return playerPositionX;
    }
    public void setPlayerPositionX(int playerPositionX) {
        this.playerPositionX = playerPositionX;
    }
    public int getPlayerPositionY() {
        return playerPositionY;
    }
    public void setPlayerPositionY(int playerPositionY) {
        this.playerPositionY = playerPositionY;
    }


}
