var http = require("https");
var retrievedJSONObjects;

class Movie_Searcher_Main {

    constructor(){}

    displayResult(nameOfMovie,callback){

        var result = ""

        var request = require("request");

        var options = { method: 'GET',
            url: 'https://api.themoviedb.org/3/search/movie',
            qs: 
                {
                    query: nameOfMovie,
                    api_key: '324938bccc324fb58e236a92cb0a9bc3' },
                    body: '{}'
                };

            request(options, function (error, response, body) {
                if (error) throw new Error(error);

                body = JSON.parse(body);

                for(var i=0; i < body.results.length; i++){

                    if(nameOfMovie.ignoreCase === body.results[i].title.ignoreCase){
                        console.log(body.results[i].title + "," + body.results[i].release_date + " , " + body.results[i].overview);
                        result = body.results[i].title + "," + body.results[i].release_date + " , " + body.results[i].overview;
                        callback(result);
                        return result;
                    }else if(nameOfMovie.ignoreCase != body.results[i].title.ignoreCase){
                        return "Movie information not found";
                    }
                }
            });
    }
   

}

module.exports = Movie_Searcher_Main;