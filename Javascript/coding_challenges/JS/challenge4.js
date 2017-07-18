function conditionals(){

	var pName = document.getElementById("txtPName").value;
	var pAge = document.getElementById("txtPAge").value;
	var pOccupation = document.getElementById("txtPOccupation").value;

	var results = document.getElementById("results");

	var persons = {fullName:pName, age:parseInt(pAge), occupation:pOccupation};

	if(persons.age >=20 && persons.age<=40){

		window.alert("Age verified and its valid");

		results.value = "";
		results.innerHTML = '<br>'+ "Name: " + pName + " " + "Age: " + pAge + " " + "Occupation: " + pOccupation;

	}else{
		window.alert("Age is not valid");
	}

}