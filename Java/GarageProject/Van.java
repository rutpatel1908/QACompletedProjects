package GarageProject;

/**
 * Created by Profile on 09/05/2017.
 */
public class Van extends Vehicle {

    String vanType;
    int vanEngine;
    int vanDoors;

    public Van(int iD, String make, String model, String vehicleType, String regNumber, String colour, int hours, String vanType, int vanEngine, int vanDoors) {
        super(iD, make, model, vehicleType, regNumber, colour, hours);
        this.vanType = vanType;
        this.vanEngine = vanEngine;
        this.vanDoors = vanDoors;
    }

    public String getVanType() {
        return vanType;
    }

    public void setVanType(String vanType) {
        this.vanType = vanType;
    }

    public int getVanEngine() {
        return vanEngine;
    }

    public void setVanEngine(int vanEngine) {
        this.vanEngine = vanEngine;
    }

    public int getVanDoors() {
        return vanDoors;
    }

    public void setVanDoors(int vanDoors) {
        this.vanDoors = vanDoors;
    }

    public String toString() {

        String s = super.toString() + getVanType() + " " + getVanEngine() + " " + getVanDoors();

        return s;
    }

}
