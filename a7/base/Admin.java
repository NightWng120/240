import java.util.*;

class Admin{

	private String accNum;
	private String pin;
	/*String declarations*/
		


	public Admin(){
		this.accNum = "00000";
		this.pin = "12345";
		/*accNum and pin attribute initializations*/
	}//end constructor
	public void setNum(String accNum){//setNum method
		
		this.accNum = accNum;//new accNum assignment

	}//end setNum
	public void setPin(String pin){//setPin method
		
		this.pin = pin;//new pin assignment
		
	}//end setPin
	public String getPin(){//getPin method

		return this.pin;//pin attribute return

	}//end getPin
	public String getNum(){//getNum method
		return this.accNum;//accNum attribute return
	}//end getNum




}//end Admin class
