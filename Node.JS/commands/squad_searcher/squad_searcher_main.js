var retrievedJSONObjects;

class Squad_Searcher_Main {

    constructor() {

       const request = require('request')
            ,url = 'https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json';

        request(url, (error, response, body)=> {
            if (!error && response.statusCode === 200) {
                retrievedJSONObjects = JSON.parse(body);
            }else {
                 console.log("Got an error: ", error, ", status code: ", response.statusCode);
            }
        });
    };
    
    
    displayResult(nmOfSquad, nameOfMember, callback){

        var result = "";

        if(nmOfSquad === retrievedJSONObjects.squadName){

            result = "Squad name found. Now processing to find the member name";
            callback(result);
            
            var retrieveMembers = retrievedJSONObjects['members'];
           
            for(var i =0; i<retrieveMembers.length;i++){
                        
                if(nameOfMember === retrieveMembers[i].name){
                    result = retrieveMembers[i].name + ", " + retrieveMembers[i].age + ", " + retrieveMembers[i].secretIdentity;
                    callback(result);

                    var powers = retrieveMembers[i].powers;

                    for(var j=0; j<powers.length;j++){

                        result = "Power: " + powers[j] + ", ";
                        callback(result);
                    } 
                    break;
                }
            }

            return result;
            
        }
    }

}

module.exports = Squad_Searcher_Main;