
public class TripletCounter {

	public static int countTriple(String stringChar) {
		  int length = stringChar.length();
		  int count = 0;	  
		  
		  for(int i = 0; i < length - 2; i++) { 
			  if(stringChar.charAt(i) == stringChar.charAt(i+1) &&  
					  stringChar.charAt(i) == stringChar.charAt(i+2)) 
				  
			  count++; 
		  }
		  
		  
		  
		  
		  return count;
	}
	
	public static void main(String [] args){
		
		System.out.println(countTriple("abjchXXXX"));
		
	}
	

}






