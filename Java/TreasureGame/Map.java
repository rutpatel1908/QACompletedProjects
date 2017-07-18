package TreasureGame;

/**
 * Created by Profile on 11/05/2017.
 */

public class Map {

    private int mapPositionX;
    private int mapPositionY;

    public Map(){};

    public Map(int mapPositionX, int mapPositionY) {
        this.mapPositionX = mapPositionX;
        this.mapPositionY = mapPositionY;
    }

    public int getMapPositionX() {
        return mapPositionX;
    }
    public void setMapPositionX(int mapPositionX) {
        this.mapPositionX = mapPositionX;
    }
    public int getMapPositionY() {
        return mapPositionY;
    }
    public void setMapPositionY(int mapPositionY) {
        this.mapPositionY = mapPositionY;
    }


}
