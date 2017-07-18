var http = require("https");
var retrievedJSONObjects;

class Weather_Searcher_Main {

    constructor(){};

    getCurrentWeather(nameOfLocation,callback){

        var result = "";

        var request = require("request");

        var options = { method: 'GET',
            url: 'https://api.apixu.com/v1/current.json',
            qs: 
                {
                    key: '025aa0b465ab4cae85183010171307',
                    q: nameOfLocation},
                    body: '{}' 
                };

            request(options, function (error, response, body) {
                if (error) throw new Error(error);

                body = JSON.parse(body);

                result = "\n" + "Weather for: " + body.location.name + "\n" + "Condition: " + body.current.condition.text + "\n" + body.current.temp_c + " c" + "\n" + body.current.temp_f + " f" + "\n";
                callback( result);
                return result;
            });
    }
        
    getForcastedWeather(nameOfLocation,numberOfDays,callback){

        var result = "";

        var request = require("request");

        var options = { method: 'GET',
            url: 'https://api.apixu.com/v1/forecast.json',
            qs: 
                {
                    key: '025aa0b465ab4cae85183010171307',
                    q: nameOfLocation,
                    days:numberOfDays},
                    body: '{}' 
                };

            request(options, function (error, response, body) {
                if (error) throw new Error(error);

                body = JSON.parse(body);

                result = "\n" + "Current Weather for: " + body.location.name + "\n" + "Condition: " + body.current.condition.text + "\n" + body.current.temp_c + " c" + "\n" + body.current.temp_f + " f" + "\n";
                callback(result);
                

                for(var i=0; i < body.forecast.forecastday.length; i++){
              
                    result = "\n" + "Date: " + body.forecast.forecastday[i].date + "\n" + "Condition: " + body.forecast.forecastday[i].day.condition.text + "\n" + "Maximum Temp in C: " + body.forecast.forecastday[i].day.maxtemp_c + " c" + "\n" + "Maximum Temp in F: " + body.forecast.forecastday[i].day.maxtemp_f + " f" + "\n" + "Minimum Temp in C: " + body.forecast.forecastday[i].day.mintemp_c + " c" + "\n" + "Minimum Temp in F: " + body.forecast.forecastday[i].day.mintemp_f + " f" + "\n";
                    callback(result);                   
                };
            });
    } 
   

}

module.exports = Weather_Searcher_Main;