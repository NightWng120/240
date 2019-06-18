public abstract class Attribute{


	protected double num;

	public Attribute(){
		this.num = 4;


	}//end constructor

	public double getNum(){
		return this.num;
	}//end getNum
	public void setNum(double num){
		if(this.num < 6){
		this.num = num;
		}//end if
	
	}//end setNum


}//end Attribute Abstract class
