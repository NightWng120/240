class Health extends Attribute{

	public Health(){
	}//end constructor
	
	public String getHealth(){
		
		if(num <= 1){

			return "Dead";
		}//end if
		if(num <= 2){
			return "Ill";
		}//end if
		if(num <= 3){
			return "Sickly";
		}//end if
		if(num <= 4){
			return "Alive";

		}//end if
		if(num <= 5){

			return "Healthy";
		}//end if
		if(num <= 6){
			return "Vigorous";
		}//end if
		if(num <= 7){
			return "Immortal";
		}//end if
		return "Alive";
	}//end getHealth




}//end Health
