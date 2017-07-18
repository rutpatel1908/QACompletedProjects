// JavaScript Document

function fizzBuzz(){

	var results = document.getElementById("results");

	for(var i=1;i<=100;i++){
		if(i%5 === 0 && i%3 === 0){
			results.innerHTML += '<br>FizzBuzz';
		} else if(i%3 === 0){
			results.innerHTML += '<br>Fizz';
		} else if(i%5 === 0){
			results.innerHTML += '<br>Buzz';
		} else {
			results.innerHTML += '<br>' + i;
		}
	}
}