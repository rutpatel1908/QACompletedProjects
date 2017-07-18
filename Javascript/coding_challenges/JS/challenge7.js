// JavaScript Document

function createParagraph(){
	
	var paragraph = document.createElement("p");
	paragraph.id="newP";
	var paragraphText = document.createTextNode("Paragraph Created.");
	paragraph.appendChild(paragraphText);

	var element = document.getElementById("results");
	element.appendChild(paragraph);
	
	window.alert("Paragraph Created");
}

function changeParagraphText(){
	
	window.alert("Paragraph Text Changed");
	document.getElementById("newP").innerHTML = "You pressed button";
}

function deleteParagraph(){
	
	var parent = document.getElementById("results");
	var child = document.getElementById("newP");
	parent.removeChild(child);
	window.alert("Paragraph Removed");
}