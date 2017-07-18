var request = require("superagent");
var assert = require('assert');
var King_Search = require("../commands/king_searcher/king_searcher_main");
searh_king = new King_Search();


describe('JSON Data Test', function() {
    it('Checking wheather JSON data exists', function(done) {
    request.get('https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/kings.json', function(error, res) {
      assert.equal(res.status, 200);
      done()
    });
  });
});

describe('King Data Check', function() {
    it('Checking wheather it returns king data', function(done) {
    request.get('https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/kings.json', function(error, res) {
    
        var checker = searh_king.displayResult("Edmund lronside");
        assert.equal("Edmund lronside,United Kingdom , 1016",checker);
        console.log(checker)
      done()
    });
  });
});