class Energy extends Attribute{

	public Energy(){
	}//end constructor
	public String getEnergy(){

		
		if(num <= 1){
			return "Asleep";			

		}//end if
		if(num <= 2){
			return "Sleepy";			

		}//end if
		if(num <= 3){
			return "Drowsy";			

		}//end if
		if(num <= 4){
			return "Awake";			

		}//end if
		if(num <= 5){
			return "Alert";			

		}//end if
		if(num <= 6){
			return "Excited";			

		}//end if
		if(num <= 7){

			return "Estatic";
		}//end if	
		return "Awake";	
	}//end getEnergy


}//end class
