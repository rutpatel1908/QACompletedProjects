package GarageProject;

/**
 * Created by Profile on 09/05/2017.
 */
public class Bike extends Vehicle {

    String bikeType;
    int bikeCC;

    public Bike(int iD, String make, String model, String vehicleType, String regNumber, String colour, int hours, String bikeType, int bikeCC) {
        super(iD, make, model, vehicleType, regNumber, colour, hours);
        this.bikeType = bikeType;
        this.bikeCC = bikeCC;
    }


    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public int getBikeCC() {
        return bikeCC;
    }

    public void setBikeCC(int bikeCC) {
        this.bikeCC = bikeCC;
    }

    public String toString() {

        String s = super.toString() + getBikeType() + " " + getBikeCC();

        return s;
    }
}
