package TreasureGame;

/**
 * Created by Profile on 11/05/2017.
 */
public class Treasure {

    private String itemName;
    private int itemPositionX;
    private int itemPositionY;

    public Treasure(){};

    public Treasure(String itemName, int itemPositionX, int itemPositionY) {
        this.itemName = itemName;
        this.itemPositionX = itemPositionX;
        this.itemPositionY = itemPositionY;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPositionX() {
        return itemPositionX;
    }

    public void setItemPositionX(int itemPositionX) {
        this.itemPositionX = itemPositionX;
    }

    public int getItemPositionY() {
        return itemPositionY;
    }

    public void setItemPositionY(int itemPositionY) {
        this.itemPositionY = itemPositionY;
    }

}
