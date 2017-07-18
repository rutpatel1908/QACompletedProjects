var assert = require('assert');
var garageOperator = require("../commands/garage_operator/garage_main");
garage = new garageOperator();

describe("Garage Operation Test", function () {
    describe("Checking garage open function", function () {
        it("There should be 5 cars after opening the garage", function () {
            garage.openGarage();
            assert.equal(5, garage.checkNumberOfCarsAvailableInGarage());
        });
    });
});

describe("Garage CheckIn Function Test", function () {
    it("It should be able to insert the car in the garage. So there will be 6 cars in the garage after inserting the following one", function () {
        garage.checkIn("Toyota", "TY98JGD","Prius", 2,1,0);
        assert.equal(6, garage.checkNumberOfCarsAvailableInGarage());
    });
});


describe("Garage Calculate Bill Function Test", function () {
    it("The bill for VX81OIP car should be £60", function () {
        var getCalculatedBill = garage.calculateBill("VX81OIP");
        assert.equal('The total bill for: Vauxhall, Insignia, VX81OIP is £60', getCalculatedBill);
    });
});


describe("Garage Checkout Car Function Test", function () {
    it("The checkout for Vauxhall Insignia with the reg number VX81OIP will be completed and the garage will have 5 cars", function () {
        garage.checkOut("VX81OIP");
        assert.equal(5, garage.checkNumberOfCarsAvailableInGarage());
    });
});

describe("Garage Display Car Function Test", function () {
    it("The garage will have 5 cars and the result will be not empty", function () {
        var checkGarage = garage.outputCars();
        assert.notEqual("", checkGarage)
        assert.equal(5, garage.checkNumberOfCarsAvailableInGarage());
    });
});

describe("Garage Empty Function Test", function () {
    it("The garage will have 0 cars", function () {
        garage.emptyList();
        assert.equal(0, garage.checkNumberOfCarsAvailableInGarage());
    });
});