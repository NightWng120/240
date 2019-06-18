import java.util.*;


class User{

	private String name;
	private	String pin;
	private	String accNum;
	private	Checking check;
	private	Savings save;
	/*Class attribures declarations*/	

	public static void main(String[] args){
		
		new User();//Object initializatoins


	}//end main


	public User(){
		
		this.name = "";
		this.pin = "";
		this.accNum = "";
		this.check = new Checking();
		this.save = new Savings();
		/*Attribute initializations*/
	}//end constructor
	
	public String getNum(){//getNum method

		return this.accNum;//accNum attribute return
	}//end getNum
	public String getPin(){//getPin method
		return this.pin;//pin attribute return

	}//end getPin
	public void setNum(String accNum){//setNum method
		this.accNum = accNum;//new accNum assignment
		
		
	}//end setNum
	public void setPin(String pin){//setPin

		this.pin = pin;//new pin assignment
	}//end setPin
	public void setName(String name){//setName method

		this.name = name;//new name assignment
	}//end setName
	public String getName(){//getName method
		return this.name;//name attribute return
	}//end getName
	public void setCheck(double check){//setCheck method
		this.check.setBalance(check);//new check attribute assignment with setBalance method
	}//end setCheck
	public double getCheck(){//getCheck method
		return this.check.getBalance();//retrun check attribute using getBalance method
	}//end getCheck
	public double getSave(){//getSave method
		return this.save.getBalance();//return save attribute using getBalance method
	}//end getSave
	public void setSave(double save){//setSave method
		save = save * this.save.getInt();
		this.save.setBalance(save);//new save attribute assignment with setBalance method
	}//end setSave




















}//end User
