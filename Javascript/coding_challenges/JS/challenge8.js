function jsonOperation(){

  var requestURL = 'https://raw.githubusercontent.com/womackx/JSONDataRepo/master/example.json';

  var request = new XMLHttpRequest();
  request.open('GET', requestURL);
  request.responseType = 'json';
  request.send();

  request.onload = function() {

      var superHeroes = request.response;

      var obj=JSON.parse(superHeroes);

      var squadName = document.createElement('h1');
      var squadNameNode= document.createTextNode("Squad Name: " + obj['squadName']);
      squadName.appendChild(squadNameNode);

      var homeTown = document.createElement('h2');
      var homeTownNode= document.createTextNode("Home Town: " + obj['homeTown']);
      homeTown.appendChild(homeTownNode);

      var formed = document.createElement('h3');
      var formedNode= document.createTextNode("Formed: " + obj['formed']);
      formed.appendChild(formedNode);

      var secretBase = document.createElement('h3');
      var secretBaseNode= document.createTextNode("Secret Base: " + obj['secretBase']);
      secretBase.appendChild(secretBaseNode);

      var active = document.createElement('h3');
      var activeNode= document.createTextNode("Active: " + obj['active']);
      active.appendChild(activeNode);

      var element = document.getElementById("results");
      element.appendChild(squadName);
      element.appendChild(homeTown);
      element.appendChild(formed);
      element.appendChild(secretBase);
      element.appendChild(active);


      var retrieveMembers = obj['members']
    
    for(var i =0; i<retrieveMembers.length;i++){
      
      var p = document.createElement('p');

      var s = retrieveMembers[i].name + ", " + retrieveMembers[i].age + ", " + retrieveMembers[i].secretIdentity + ", " + retrieveMembers[i].age + ", " + "Powers: ";


      var powers = retrieveMembers[i].powers;
      for(var j=0; j<powers.length;j++){

        s = s + powers[j] + ", ";
      }

      p.textContent=s;

      element.appendChild(p);
    }
    

      
  }

};
