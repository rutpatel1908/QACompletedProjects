package TreasureGame;

/**
 * Created by Profile on 11/05/2017.
 */
public class Compass {

    public float calculateDistance(int playerXPosition , int playerYPosition, int treasureXPosition, int treasureYPosition){

        float calculatedDistance = 0;

        if(playerXPosition == treasureXPosition && playerYPosition == treasureXPosition){

            calculatedDistance = 0;

            return calculatedDistance;
        }else{

            calculatedDistance = (float) Math.sqrt((((playerXPosition-treasureXPosition) * ((playerXPosition-treasureXPosition))+((playerYPosition-treasureXPosition) * (playerYPosition-treasureXPosition)))));
        }

        return calculatedDistance;
    }
}
