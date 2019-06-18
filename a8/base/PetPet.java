public abstract class PetPet{

	protected Hunger hunger;
	protected Health health;
	protected Energy energy;
	protected Temper temper;
	protected String name;

	public PetPet(){
		this.hunger = new Hunger();
		this.health = new Health();
		this.energy = new Energy();
		this.temper = new Temper();


	}//end PetPet
	public void play(double play){
		this.temper.setNum((this.temper.getNum() + play/2));
		this.energy.setNum((this.energy.getNum() - play));
	}//end play	
	public void feed(double food){
		this.hunger.setNum((this.hunger.getNum() + food));
		this.energy.setNum((this.energy.getNum() - food/2));
		if(this.hunger.getNum() > 6 || this.hunger.getNum() < 3){
			this.health.setNum((this.health.getNum() - .125 * 7));
		}//end if
	}//end feed
	public void pet(){
		if(this.temper.getNum() < 4){
			this.health.setNum((this.health.getNum() - .125 * 7));
		}//end if
		this.temper.setNum((this.temper.getNum() + .1 * 7));
	}//end pet
	public void sleep(double hrs){
		this.energy.setNum((this.energy.getNum() + .75 * hrs));	
		this.hunger.setNum((this.hunger.getNum() - .3 * 7));	
	}//end sleep
	














}//end class
