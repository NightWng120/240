import java.util.*;

class Savings extends Checking{

	private int time;
	private double rate;
	/*time and rate attributes declarations*/
	public static void main(String[] args){
		new Savings();//Object initialization
	}//end main

	public Savings(){
		this.time = 1;
		this.rate = .25;
		/*tme and rate initializations*/
	}//end constructor
	public double getInt(){//getInt method for interest return
		return (1 + this.rate * this.time);//Interest calculatoin return
	}//end getInt
	public void setInt(double rate, int time){//setInt method
		this.rate = rate;
		this.time = time;
		/*new time and rate attribute assignment*/

	}//end setInt
	
}//end Saving class
