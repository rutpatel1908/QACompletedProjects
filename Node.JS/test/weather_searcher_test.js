var request = require("superagent");

var assert = require('assert');
var Weather_Search = require("../commands/weather_searcher/weather_searcher_main");
search_weather = new Weather_Search();


describe('Current Weather JSON Data Test', function() {
    it('Checking wheather JSON data exists', function(done) {
    request.get('https://api.apixu.com/v1/current.json?key=025aa0b465ab4cae85183010171307&q=London', function(error, res) {
      assert.equal(res.status, 200);
      done();
    });
  });
});

describe('Forecast Weather JSON Data Test', function() {
    it('Checking wheather JSON data exists', function(done) {
    request.get('https://api.apixu.com/v1/forecast.json?key=025aa0b465ab4cae85183010171307&q=London', function(error, res) {
      assert.equal(res.status, 200);
      done();
    });
  });
});