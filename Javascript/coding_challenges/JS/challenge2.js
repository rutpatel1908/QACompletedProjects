var sumresults, results;
var person;


function returnSquareRoot(){

	var input = document.getElementById("txtSquareNumber").value;

	var calculateSquare = input * input;

	window.alert(calculateSquare);
}


function returnSum(){

	sumresults = document.getElementById("sumresults");

	var numberOne = document.getElementById("txtNumberOne").value;
	var numberTwo = document.getElementById("txtNumberTwo").value;
	var numberThree = document.getElementById("txtNumberThree").value;


	var calculateSum = parseInt(numberOne) + parseInt(numberTwo) + parseInt(numberThree);

	window.alert("Sum has been calculated successfully");

	sumresults.value = "";
	sumresults.innerHTML += calculateSum;

}




function returnPersonObject(){

	var personName = document.getElementById("txtPersonName").value;
	var personAge = document.getElementById("txtPersonAge").value;
	var personOccupation = document.getElementById("txtPersonOccupation").value;

	person = {fullName:personName, age:parseInt(personAge), occupation:personOccupation};

	results = document.getElementById("results");

	results.value = "";
	results.innerHTML = '<br>'+ "Person Object Created: " + '<br>' + "Name: " + personName + " " + "Age: " + personAge + " " + "Occupation: " + personOccupation + '<br>';


	person.fullName = "John";
	person.age = 54;
	person.occupation = "Network Engineer";

	results.innerHTML += '<br>'+ "Person Object Edited: " + '<br>' + "Name: " + person.fullName + " " + "Age: " + person.age + " " + "Occupation: " + person.occupation + '<br>';


	var incrementPersonAge = person.age++;


	window.alert("Person Age Incremented");

	incrementAge(person.fullName, parseInt(person.age),person.occupation);
}

function incrementAge(fullName, age, occupation){

	var incrementCurrentAge = age++;
	results.innerHTML += '<br>'+ "Person Age Incremented: " + '<br>' + "Name: " + person.fullName + " " + "Age: " + person.age + " " + "Occupation: " + person.occupation + '<br>';
}