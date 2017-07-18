package TreasureGame;

/**
 * Created by Profile on 11/05/2017.
 */
import java.util.Random;
import java.util.Scanner;


public class Game {

    public Game(){};

    boolean isFound=false;

    Treasure t = new Treasure();
    Player s = new Player();
    Compass c = new Compass();

    public void movePlayer(String move){

        if(s.getPlayerPositionX() == t.getItemPositionX() && s.getPlayerPositionY() == t.getItemPositionY()) {

            System.out.println("Congratulations you have found the treasure which is: " + t.getItemName());
            System.out.println("Game Ended. Thank you for playing the game");
            System.exit(0);
        }else {
            switch (move) {
                case "North":
                    System.out.println("North is entered");

                    if (s.getPlayerPositionY() == 0) {

                        System.out.println("You have already reached to the top. Please type different direction");
                    } else {
                        s.setPlayerPositionY(s.getPlayerPositionY() - 1);
                        System.out.println("Your new position is " + s.getPlayerPositionX() + " , " + s.getPlayerPositionY());
                        System.out.println(c.calculateDistance(s.getPlayerPositionX(),s.getPlayerPositionY(),t.getItemPositionX(),t.getItemPositionY()));
                    }
                    break;
                case "South":
                    System.out.println("South is entered");
                    if (s.getPlayerPositionY() == 10) {

                        System.out.println("You have already reached to the bottom. Please type different direction");
                    } else {
                        s.setPlayerPositionY(s.getPlayerPositionY() + 1);
                        System.out.println("Your new position is " + s.getPlayerPositionX() + " , " + s.getPlayerPositionY());
                    }
                    break;
                case "East":
                    System.out.println("East is entered");
                    if (s.getPlayerPositionX() == 10) {

                        System.out.println("You have already reached to the eastern side. Please type different direction");
                    } else {
                        s.setPlayerPositionX(s.getPlayerPositionX() + 1);
                        System.out.println("Your new position is " + s.getPlayerPositionX() + " , " + s.getPlayerPositionY());
                    }
                    break;
                case "West":
                    System.out.println("West is entered");
                    if (s.getPlayerPositionX() == 0) {

                        System.out.println("You have already reached to the western side. Please type different direction");
                    } else {
                        s.setPlayerPositionX(s.getPlayerPositionX() - 1);
                        System.out.println("Your new position is " + s.getPlayerPositionX() + " , " + s.getPlayerPositionY());
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    public void startNewGame(){

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        t.setItemName("Diamond Necklace");
        t.setItemPositionX(r.nextInt(10) + 1);
        t.setItemPositionY(r.nextInt(10) + 1);

        s.setPlayerPositionX(r.nextInt(10) + 1);
        s.setPlayerPositionY(r.nextInt(10) + 1);

        System.out.println("Your starting position is " + s.getPlayerPositionX() + " , " + s.getPlayerPositionY() + "\n");

        System.out.println("Please enter your direction:");
        System.out.println("[1] North");
        System.out.println("[2] South");
        System.out.println("[3] East");
        System.out.println("[4] West");

        System.out.println("\n");

        System.out.println("Please enter your choice:");

        do{
            String move = sc.next();
            movePlayer(move);
        }while(true);
    }


    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Treasure Hunt Game");
        System.out.println("Please choose an option from the following:");
        System.out.println("[1] Start Game");
        System.out.println("[2] Exit");

        System.out.println("\n");

        System.out.println("Please enter your choice:");

        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Starting new game");
                Game game = new Game();
                game.startNewGame();
                break;
            case 2:
                System.out.println("Exiting Game");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }

        sc.close();
    }
}
