var request = require("superagent");

var assert = require('assert');
var Squad_Search = require("../commands/squad_searcher/squad_searcher_main");
search_squad = new Squad_Search();


describe('JSON Data Test', function() {
    it('Checking wheather JSON data exists', function(done) {
    request.get('https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json', function(error, res) {
      assert.equal(res.status, 200);
      done();
    });
  });
});