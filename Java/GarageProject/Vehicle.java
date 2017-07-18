package GarageProject;

public abstract class Vehicle {

    private int iD;
    private String make;
    private String model;
    private String vehicleType;
    private String regNumber;
    private String colour;

    private int hours;

    public Vehicle(){};

    public Vehicle(int iD, String make, String model, String vehicleType, String regNumber, String colour, int hours) {
        this.iD = iD;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.regNumber = regNumber;
        this.colour = colour;
        this.hours = hours;
    }

    public void setVehicleID(int iD){
        this.iD = iD;
    }

    public void setVehicleMake(String make){
        this.make = make;
    }

    public void setVehicleModel(String model){
        this.model = model;
    }

    public void setVehicleType(String regNumber){
        this.regNumber = regNumber;
    }
    public void setVehicleColour(String colour){
        this.colour = colour;
    }


    public int getVehicleID(){
        return iD;
    }

    public String getVehicleMake(){
        return make;
    }

    public String getVehicleModel(){
        return model;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public String getVehicleColour(){
        return colour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String toString(){

        String s = getVehicleID() + " " + getVehicleMake() + " " + getVehicleModel() + " " + getVehicleType() + " " + getVehicleColour() + " ";

        return s;
    }
}
