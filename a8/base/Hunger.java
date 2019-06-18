class Hunger extends Attribute{

	public Hunger(){
	}//end constructor
	public String getHunger(){
		if(num <= 1){
			return "Starving";			

		}//end if
		if(num <= 2){
			return "Hungry";			

		}//end if
		if(num <= 3){
			return "Famished";			

		}//end if
		if(num <= 4){
			return "Full";			

		}//end if
		if(num <= 5){
			return "Stuffed";			

		}//end if
		if(num <= 6){
			return "Over Stuffed";			

		}//end if
		if(num <= 7){

			return "Bursting";
		}//end if	
		return "Full";
	}//end getHunger
	
}//end class
