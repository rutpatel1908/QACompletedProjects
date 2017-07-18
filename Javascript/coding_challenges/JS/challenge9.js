var obj;



function jsonOperation(){

  var requestURL = 'https://raw.githubusercontent.com/womackx/JSONDataRepo/master/kings.json';

  var request = new XMLHttpRequest();
  request.open('GET', requestURL);
  request.responseType = 'json';
  request.send();

  request.onload = function() {

      var kings = request.response;

      obj=JSON.parse(kings);
      
  };

}


function kingDataSearcher(){
   

   var element = document.getElementById("results");
    
      var getKingName = document.getElementById("kingName").value;
      
      for(var i =0; i<obj.length-1;i++){
      
        if(getKingName === obj[i].nm){

          window.alert("Data found for king: " + getKingName)
          var p = document.createElement('p');

          var s = obj[i].nm + ", " + obj[i].cty + ", " + obj[i].hse + ", " + obj[i].yrs;

          p.textContent=s;

          element.appendChild(p);
          break;
          
        }

      }

};


