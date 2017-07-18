package Blackjack;

/**
 * Created by Profile on 12/05/2017.
 */
public class BlackjackModel{

    public BlackjackModel(){};

    public int blackjackOperation(int numberOne, int numberTwo){

        int answer = 0;

        if (numberOne > 21 && numberTwo > 21) {

            System.out.println("Oops your both values gone above 21. Please try again");
            answer = 0;

        } else if (numberOne > numberTwo) {

            answer = numberOne;
            System.out.println("The value: " + answer + " is closest to 21");

        } else if (numberTwo > numberOne) {

            answer = numberTwo;
            System.out.println("The value: " + answer + " is closest to 21");

        } else if (numberOne == numberTwo || numberTwo == numberOne) {

            System.out.println("Oops your both values are the same");
            answer = numberOne;

        }

        return answer;
    }

}
