// JavaScript Document

var cars=[];
    
    checkIn("Audi","yf10rgh","A6",0,1,1);
    checkIn("Bmw","rf11rth","5 series",1,0,1);
    checkIn("Mercedes","yf14rgj","E class",0,2,1);
    checkIn("Vauxhall","yf15rgf","Insignia",1,3,1);
  


  function executeCode(value){
   var words=value.split(",");
  
   switch(words[0]){
    case "checkin":
          checkIn(words[1],words[2],words[3],words[4],words[5],words[6]);      
          break;
    case "output":
         outputCars();
         break
    case "checkout":
          checkOut(words[1]);
          break;
    case "bill":
          calculateBill(words[1]);
          break;
    case "empty":
          emptyList();
          break;

   }

  } 

   

   function checkIn(m,r,m1,sf,mf,lf){
    cars[cars.length]={make:m,reg:r,model:m1,smallfaults:sf,mediumfaults:mf,largefaults:lf};

    document.getElementById('command').value=m+"  "+m1+"  "+r+ "   added to Garage!"
    
   }
   

   function checkOut(id){
      window.alert(id);
    for(var i=0;i<cars.length;i++){

      if(id===cars[i].reg){
        document.getElementById('command').value=cars[i].make+" "+cars[i].model+" "+cars[i].reg+ "  deleted from Garage!";
        cars.splice(i,1);
        
        
      }
    }
    
   }

   function outputCars(){
    var element = document.getElementById("results");
        element.innerHTML="";
    for(var i=0;i<cars.length;i++){
       var p = document.createElement('p');

        p.textContent=cars[i].make+", "+cars[i].model+", "+cars[i].reg;
        element.appendChild(p);

    
   }
 }
    
   function calculateBill(registration){
   
    var element = document.getElementById("bill");
    element.innerHTML="";
    for(var i=0;i<cars.length;i++){

      if(registration===cars[i].reg){
        var total=cars[i].smallfaults*10+cars[i].mediumfaults*20+cars[i].largefaults*30;
      // var p = document.createElement('p');
       document.getElementById('command').value="The total bill for: "+cars[i].make+", "+cars[i].model+", "+cars[i].reg+" is "+total+" $";
       // p.textContent="The total bill for: "+cars[i].make+", "+cars[i].model+", "+cars[i].reg+" is "+total+" $";
       // element.appendChild(p);
         break;
       }
   }
 }

function emptyList(){

    cars.splice(0,cars.length);
}
 function clearBox(elementID){
    document.getElementById(elementID).innerHTML = "";
}