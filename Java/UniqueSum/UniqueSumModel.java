package UniqueSum;

/**
 * Created by Profile on 12/05/2017.
 */
public class UniqueSumModel {

    public UniqueSumModel(){};

    public int uniqueSumOperation(int numberOne, int numberTwo, int numberThree){

        int answer = 0;

        if(numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree){

            answer = numberOne + numberTwo + numberThree;
            System.out.println("Sum of " + numberOne + " + " + numberTwo + " + " + numberThree + " = " + answer);
            return answer;
        }else if(numberOne == numberTwo){

            answer = numberThree;
            System.out.println("Sum of " + numberOne + " + " + numberTwo + " + " + numberThree + " = " + answer);
            return answer;
        }else if(numberOne == numberThree){

            answer = numberTwo;
            System.out.println("Sum of " + numberOne + " + " + numberTwo + " + " + numberThree + " = " + answer);
            return answer;
        }else if(numberTwo == numberThree){

            answer = numberOne;
            System.out.println("Sum of " + numberOne + " + " + numberTwo + " + " + numberThree + " = " + answer);
            return answer;
        }

        return answer;
    }
}
