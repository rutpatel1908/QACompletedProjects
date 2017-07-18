const cars = [];

class Garage_Operator {
  constructor() {}

openGarage(){
    
    this.checkIn("BMW","BW15GDY", "X5",0,2,3);
    this.checkIn("Range Rover","RG91JKL", "Urban",1,3,2);
    this.checkIn("Vauxhall","VX81OIP", "Insignia",3,0,1);
    this.checkIn("Honda","HD32VBN", "Civic",0,0,1);
    this.checkIn("Volkswagen","VW56DFG", "Golf",2,1,2);
}

checkIn(m,r,m1,sf,mf,lf){
    cars[cars.length]={make:m,reg:r,model:m1,smallfaults:sf,mediumfaults:mf,largefaults:lf};
}

checkOut(regnumber){

    for(var i=0;i<cars.length;i++){
      if(regnumber===cars[i].reg){
        cars.splice(i,1);
      }
    };
}

outputCars(){

    var results = ""

    for(var i=0;i<cars.length;i++){
    
        results=results+cars[i].make+", "+cars[i].model+", "+cars[i].reg;
    };

   if(results==""){
        return "No cars in the garage!";
    }else{
        return results;
    }
}

checkNumberOfCarsAvailableInGarage(){
    return cars.length;
}

calculateBill(registration){

     var totalBill = "";

    for(var i=0;i<cars.length;i++){
        if(registration===cars[i].reg){
            var total=cars[i].smallfaults*10+cars[i].mediumfaults*20+cars[i].largefaults*30;
      
            totalBill="The total bill for: "+cars[i].make+", "+cars[i].model+", "+cars[i].reg+" is "+ "£" + total;
            return totalBill;
        }
   };
    return "No car found!";
}

emptyList(){
     cars.splice(0,cars.length);
}

}
module.exports = Garage_Operator;