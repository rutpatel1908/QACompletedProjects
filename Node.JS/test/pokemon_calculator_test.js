var assert = require('assert');
var Pokemon = require("../commands/pokemon_calculator/pokemon_main");
pokemon = new Pokemon();


describe("Pokemon Multiplyer Test", function () {
    describe("Pokemon Multiplyer Calculator Function", function () {
        it("Normal against Fire should return 1", function () {
            var res=pokemon.displayResult("Normal","Fire");
            assert.equal("Normal" + " " + "VS " + " " + "Fire" + " = " + " " + 1 + "x",res);
        });
    });
});

describe("Pokemon Multiplyer Test", function () {
    describe("Pokemon Multiplyer Calculator Function", function () {
        it("Fire against Water should return 0.5", function () {
            var res=pokemon.displayResult("Fire","Water");
            assert.equal("Fire" + " " + "VS " + " " + "Water" + " = " + " " + 0.5 + "x",res);
        });
    });
});

describe("Pokemon Multiplyer Test", function () {
    describe("Pokemon Multiplyer Calculator Function", function () {
        it("Electric against Grass should return 0.5", function () {
            var res=pokemon.displayResult("Electric","Grass");
            assert.equal("Electric" + " " + "VS " + " " + "Grass" + " = " + " " + 0.5 + "x",res);
        });
    });
});