import java.util.*;

class Checking{

	protected double balance;//balance declaration
	
	public static void main(String[] args){
		new Checking();//Object initialization
	}//end main	

	public Checking(){

		this.balance = 0;//balance assingment
	}// end constructor
	public void setBalance(double balance){//setBalance method
		this.balance = balance;//new balance assignment

	}//end setBalance
	public double getBalance(){//getBalance method
		return this.balance;//balance attribute return
	}//end getBalance


}//end Checking class
