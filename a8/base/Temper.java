class Temper extends Attribute{

	public Temper(){
	}//end constructor
	public String getTemper(){

		
		if(num <= 1){
			return "Suicidal";			

		}//end if
		if(num <= 2){
			return "Depressed";			

		}//end if
		if(num <= 3){
			return "Sad";			

		}//end if
		if(num <= 4){
			return "Content";			

		}//end if
		if(num <= 5){
			return "Happy";			

		}//end if
		if(num <= 6){
			return "Joyful";			

		}//end if
		if(num <= 7){

			return "Elated";
		}//end if	
		return "Content";
	}//end getTemper


}//end class
