package GarageProject;

/**
 * Created by Profile on 09/05/2017.
 */
public class Car extends Vehicle {

    String carType;

    String carEngine;
    String carDoors;
    int carHP;
    int carSeats;

    public Car(int iD, String make, String model, String vehicleType, String regNumber, String colour, int hours, String carType, String carEngine, String carDoors, int carHP, int carSeats) {
        super(iD, make, model, vehicleType, regNumber, colour, hours);
        this.carType = carType;
        this.carEngine = carEngine;
        this.carDoors = carDoors;
        this.carHP = carHP;
        this.carSeats = carSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarDoors() {
        return carDoors;
    }

    public void setCarDoors(String carDoors) {
        this.carDoors = carDoors;
    }

    public int getCarHP() {
        return carHP;
    }

    public void setCarHP(int carHP) {
        this.carHP = carHP;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
    }

    public String toString() {

        String s = super.toString() + getCarEngine() + " " + getCarHP() + " " + getCarSeats() + " " + getCarDoors();

        return s;
    }
}
