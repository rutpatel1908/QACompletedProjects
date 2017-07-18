var request = require("superagent");
var assert = require('assert');
var Movie_Search = require("../commands/movie_searcher/movie_searcher_main");
search_movie = new Movie_Search();


describe('JSON Data Test', function() {
    it('Checking wheather JSON data exists', function(done) {
    request.get('https://api.themoviedb.org/3/search/movie?api_key=324938bccc324fb58e236a92cb0a9bc3&query=Home%20Alone%203', function(error, res) {
      assert.equal(res.status, 200);
      done()
    });
  });
});

describe('Movie Data Check', function() {
    it('Checking wheather it returns movie data', function(done) {
    
        search_movie.displayResult("Home Alone 3",(a)=>assert.equal("Home Alone 3" + "," + "1997-12-12" + " , " + "9-year-old Alex Pruitt is home alone with the chicken pox. Turns out, due to a mix-up among nefarious spies, Alex was given a toy car concealing a top-secret microchip. Now Alex must fend off the spies as they try break into his house to get it back.",a));
        done();
  });
});