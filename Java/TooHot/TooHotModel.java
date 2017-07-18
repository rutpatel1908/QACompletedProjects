package TooHot;

/**
 * Created by Profile on 12/05/2017.
 */
public class TooHotModel {

    public TooHotModel(){};

    public boolean summerCheck(int temp, boolean isSummer){

        boolean result = true;

        if(isSummer){

            if(temp>=60 && temp<=100){
                System.out.print("Congratulations your temperature is in the range");
                result = true;
            }else if(temp <60 || temp > 100){
                System.out.print("Sorry your temperature is not in the range. Please try again");
                result = false;
            }

        }else if(!isSummer){
            if(temp>=60 && temp<=90){
                System.out.print("Congratulations your temperature is in the range.");
                result = true;
            }else if(temp <60 || temp > 90){
                System.out.print("Sorry your temperature is not in the range. Please try again");
                result = false;
            }
        }

        return result;
    }
}
