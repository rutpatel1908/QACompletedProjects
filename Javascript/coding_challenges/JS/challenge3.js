function conversion(){
	var string = 'He said " My name is Elite"';

	window.alert(string);
	window.alert(string.toUpperCase());

	var addString = "String Addition: " + " " + "1" + 2;

	window.alert(addString);

	var cars = ["Saab", "Volvo", "BMW"]; 
	window.alert("Car Array has: " + cars);


	var insertNewCar = cars.push("VW");
	window.alert("New Car Added: " + cars);

	var removeLastCar = cars.pop();
	window.alert("One Car Removed: " + cars);
}