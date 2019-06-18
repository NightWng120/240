import java.util.*;



class Liger extends PetPet{

	public Liger(String name){
		this.name = name;
	}//end constructor
	public void menuLiger(){
		Scanner input = new Scanner(System.in);
		String userin;
		double userIn = 0;
		boolean loop = true;
		boolean loop2 = true;
		if(health.getHealth().equals("Dead")){
			System.out.println("Your pet is dead :(");
			loop = false;
		}//end if
		while(loop){
	
			System.out.println("|-------------------------|");
			System.out.println("      " + this.name + "       ");
			System.out.println("|        The Liger        |");
			System.out.println("|-------------------------|");
			System.out.println("| What would you like to  |");
			System.out.println("| do with your Liger?     |");
			System.out.println("|-------------------------|");
			System.out.println("| 1) Play with my Liger   |");
			System.out.println("| 2) Feed my Liger        |");
			System.out.println("| 3) Put my Liger to bed  |");
			System.out.println("| 4) Pet my Liger         |");
			System.out.println("| 5) Ride my Liger        |");
			System.out.println("| 6) Show my Liger's Stat |");
			System.out.println("| 7) Quit                 |");
			System.out.println("|-------------------------|");
			System.out.printf("\n\n");
			System.out.println(": ");
			userin = input.nextLine();
			System.out.printf("\n\n");
			if(userin.equals("1")){
				
					
				System.out.println("|-------------------------|");
				System.out.println("|         Play Time       |");
				System.out.println("|-------------------------|");
				System.out.println("| How long would you like |");
				System.out.println("| to play with your Liger?|");
				System.out.println("|-------------------------|");
				System.out.println("|****Enter time in hrs****|");
				System.out.println("|-------------------------|");
				System.out.printf("\n\n");
				System.out.printf(": ");
				userIn = input.nextDouble();
				System.out.printf("\n\n");
				
					System.out.println(this.name + " the Liger chases the red dot of the laser pointer, furiously trying to trap it in its pawy grasp");
					System.out.printf("\n\n");
				
						userin = input.nextLine();
				continue;			

			}//end if
			if(userin.equals("2")){

				while(loop2){

					System.out.println("|-------------------------|");
					System.out.println("|        Food Time        |");
					System.out.println("|-------------------------|");
					System.out.println("| Choose what you would   |");
					System.out.println("| like to feed your Liger |");
					System.out.println("|-------------------------|");
					System.out.println("| 1) Cat food             |");
					System.out.println("| 2) Fish                 |");
					System.out.println("| 3) Lasagna              |");
					System.out.println("| 4) Cat nip              |");
					System.out.println("| 5) Nothing              |");
					System.out.println("|-------------------------|");
					System.out.printf("\n\n");
					System.out.println(": ");
					userin = input.nextLine();
					System.out.printf("\n\n");
					if(userin.equals("1")){
						feed(.25 * 7);
						System.out.println(this.name + " eats the food in one bite");
						System.out.printf("\n\n");

						userin = input.nextLine();


						continue;
					}//end if	
					if(userin.equals("2")){
						feed(.375*7);
						System.out.println(this.name + "happily naws on the fish");
						System.out.printf("\n\n");

						userin = input.nextLine();
						continue;
					}//end if
					if(userin.equals("3")){
						feed(.5*7);
						System.out.println(this.name + " jumps on your counter, and steals your lasgna while making snide remarks in cat language");
						System.out.printf("\n\n");

						userin = input.nextLine();
						continue;
					}//end if
					if(userin.equals("4")){
						feed(.125*7);
						System.out.println(this.name + " looks at you with a dazed and confused look before falling over and sleeping");
						System.out.printf("\n\n");

						userin = input.nextLine();
						continue;
					}//end if
					if(userin.equals("5")){
						System.out.printf("\n\n");
						loop2 = false;
					}//end if
				}//end while loop                

				continue;
			}//end if
			if(userin.equals("3")){

				System.out.println("|-------------------------|");
				System.out.println("|        Sleepy Time      |");
				System.out.println("|-------------------------|");
				System.out.println("| How long should your    |");
				System.out.println("| Liger sleep?            |");
				System.out.println("|-------------------------|");
				System.out.println("|****Enter time in hrs****|");
				System.out.println("|-------------------------|");
				System.out.printf("\n\n");
				System.out.printf(": ");
				userIn = input.nextDouble();
				System.out.printf("\n\n");
				System.out.println(this.name + " drifts off to sleep");
		
						userin = input.nextLine();
				continue;
			}//end if
			if(userin.equals("4")){
				pet();
				System.out.println(this.name + " snuggles up to you as you pet their soft fur");
				System.out.printf("\n\n");

						userin = input.nextLine();
			}//end if
			if(userin.equals("5")){
				
				System.out.println("As " + this.name + " soars into the sky, you fall off and " +this.name + " flys off without you");		
				System.out.printf("\n\n");

						userin = input.nextLine();
				continue;
			}//end if
			if(userin.equals("6")){
				

				System.out.println("|-------------------------|");
				System.out.println("      " + this.name + "      ");
				System.out.println("|    The Liger's Status   |");
				System.out.println("|-------------------------|");
				System.out.println("| Health: " + health.getHealth());
				System.out.println("| Hunger: " + hunger.getHunger());
				System.out.println("| Temperament: " + temper.getTemper());
				System.out.println("| Energy: "+ energy.getEnergy());
				System.out.println("|-------------------------|");
				System.out.println("\n\n");
				System.out.println("Press Enter to Continue");
				userin = input.nextLine();
				System.out.printf("\n\n");
			}//end if
			if(userin.equals("7")){
				loop = false;

			}//end if
        	}//end while loop        
	}//end menuLiger

}//end Liger class

































