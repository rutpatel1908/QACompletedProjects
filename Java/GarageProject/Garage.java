package GarageProject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Profile on 09/05/2017.
 */
public class Garage {

    List<Vehicle> operation = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle insertVehicle){
        operation.add(insertVehicle);
    }

    public void removeVehicle(Vehicle removeVehicle){
        operation.remove(removeVehicle);
    }

    public int calculateBill(Vehicle vehicleType){

        int hours = vehicleType.getHours();
        int answer = 0;

        if(vehicleType instanceof Car){

            answer = hours * 20;
            return answer;
        }else if(vehicleType instanceof Bike){

            answer = hours * 10;
            return answer;

        }else if(vehicleType instanceof Van){

            answer = hours * 30;
            return answer;
        }

        return answer;
    }

    public void displayData(){

        for(int i = 0;i<operation.size(); i++){

            System.out.println(operation.get(i).toString() + ". " + "Total Repair Cost: " + calculateBill(operation.get(i)));
        }
    }


    public static void main(String[] args){

        Garage garage = new Garage();
        garage.addVehicle(new Car(1, "VW", "Passat", "Car", "SV73QWD","Blue", 7,"Saloon", "1999", "5", 120, 5));
        garage.addVehicle(new Bike(2, "Honda", "CVR", "Bike", "OP85SQI", "Black", 4, "Sports Bike", 300));
        garage.addVehicle(new Van(3, "Ford", "Transit", "Van", "JW52NBV", "Silver", 9,"Passenger Carrier Van", 2500, 9));
        garage.removeVehicle(garage.operation.get(1));
        garage.displayData();
    }
}
