var retrievedJSONObjects;

class King_Searcher_Main {

    constructor() {

       const request = require('request')
            ,url = 'https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/kings.json'

        request(url, (error, response, body)=> {
            if (!error && response.statusCode === 200) {
                retrievedJSONObjects = JSON.parse(body);
            }else {
                 console.log("Got an error: ", error, ", status code: ", response.statusCode);
            }
        });
    }
    
    
    displayResult(nameOfKing){

        var result = "";
        
        for(var i=0; i < retrievedJSONObjects.length-1; i++){
            if(nameOfKing === retrievedJSONObjects[i].nm){
                console.log(retrievedJSONObjects[i].nm + "," + retrievedJSONObjects[i].cty + " , " + retrievedJSONObjects[i].yrs);
                result = (retrievedJSONObjects[i].nm + "," + retrievedJSONObjects[i].cty + " , " + retrievedJSONObjects[i].yrs);
                return result;
                break;
            }
        };
                    
        if(nameOfKing != retrievedJSONObjects[i].nm){
            result = "King not found";
            return result;
        };
    

    }

}

module.exports = King_Searcher_Main;