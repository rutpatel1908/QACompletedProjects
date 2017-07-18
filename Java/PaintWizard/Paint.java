package PaintWizard;


/**
 * Created by Profile on 09/05/2017.
 */
public class Paint {

    String paintName;
    double paintPrice;
    int noOfLitres;
    int coverageSize;
    int roomSize;


    public Paint(){};

    public Paint(String paintName, int noOfLitres, double paintPrice, int coverageSize) {
        this.paintName = paintName;
        this.paintPrice = paintPrice;
        this.noOfLitres = noOfLitres;
        this.coverageSize = coverageSize;
    }

    public String getPaintName() {
        return paintName;
    }

    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }

    public double getPaintPrice() {
        return paintPrice;
    }

    public void setPaintPrice(double paintPrice) {
        this.paintPrice = paintPrice;
    }

    public int getNoOfLitres() {
        return noOfLitres;
    }

    public void setNoOfLitres(int noOfLitres) {
        this.noOfLitres = noOfLitres;
    }

    public int getCoverageSize() {
        return coverageSize;
    }

    public void setCoverageSize(int coverageSize) {
        this.coverageSize = coverageSize;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }






    public int calculateTotalCoverage(){
        return getNoOfLitres()*getCoverageSize();
    }


    public double getTotalPrice(int roomSize){

        double calculateNoOfCans = (double)roomSize / (double)this.calculateTotalCoverage();
        int numberOfCans;

        if(Math.ceil(calculateNoOfCans) == Math.floor(calculateNoOfCans)){
            numberOfCans = (int)calculateNoOfCans;
        }else{
            numberOfCans = (int)calculateNoOfCans+1;
        }

        double totalPaintPrice = numberOfCans * this.getPaintPrice();

        return totalPaintPrice;

    }


    public int getWastedPaint(int roomSize){

        double calculateNoOfCans = (double)roomSize / (double)this.calculateTotalCoverage();
        int numberOfCans;

        if(Math.ceil(calculateNoOfCans) == Math.floor(calculateNoOfCans)){
            numberOfCans = (int)calculateNoOfCans;
        }else{
            numberOfCans = (int)calculateNoOfCans+1;
        }

        int totalsurface=numberOfCans*this.calculateTotalCoverage();//total squares
        int difference=roomSize-totalsurface;//waste in terms of square metres
        int waste=difference/this.getCoverageSize();//waste in terms of litres

        return waste;

    }



    @Override
    public String toString() {
        return getPaintName() + " (" + getNoOfLitres() + ") Litre  £ " + getPaintPrice()
                + "\n" + "This tin of paint will cover "+getCoverageSize() + "square metres per Lire";
    }

}