 function randomNumberCalculator(){

	var randomNumber = Math.floor(Math.random() * (1000 - 1 + 1)) + 1;
   	document.write("Results for "+randomNumber+" :  ");

    while(randomNumber>1){
    	if(randomNumber%3==0){
            randomNumber=randomNumber/3;
                document.writeln(randomNumber);
                document.write('<br/>');
        }else
            if((randomNumber+1)%3==0){
                randomNumber=randomNumber+1;
                randomNumber=randomNumber/3;
                document.writeln(randomNumber);
                document.write('<br/>'); 
            }
            else if((randomNumber-1)%3==0){
                randomNumber=randomNumber-1;
                randomNumber=randomNumber/3;
                document.writeln(randomNumber);
                document.write('<br/>'); 

            }
        }
}
            