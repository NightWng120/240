class B-Owl extends PetPet{

	public B-Owl(){
	}//end constructor
	public boolean throwAway(){
		
		Scanner input = new Scanner(System.in);
		String userin;

		System.out.println("You threw away B'Owl!");
		System.out.println("%n%nWould you like to fish B'Owl out of the trash?(Y/N)");
		userin = input.nextLine();
		if(userin.equals("N") || userin.equals("n")){

			System.out.println("Now no one ever has to see it's hideous face again!");
			return false;

		}//end if
		else if(userin.equals("Y") || userin.equals("y")){
			
			System.out.println("Your B'Owl now waits to have its revenge");
			return true;

		}//end else if

	}//end throwAway

	public void menuBowl(){
		Scanner input = new Scanner(System.in);
		String userin;
		Double userIn;
		boolean loop;
		boolean loop2;
		
		while(loop){

			System.out.println("|-------------------------|");
			System.out.println("      " + this.name + "      " );
			System.out.println("|        The B'Owl        |");
			System.out.println("|-------------------------|");
			System.out.println("| What would you like to  |");
			System.out.println("| do with your B'Owl?     |");
			System.out.println("|                         |");
			System.out.println("| 1) Play with B'Owl      |");
			System.out.println("| 2) Feed B'Owl           |");
			System.out.println("| 3) Pet B'Owl            |");
			System.out.println("| 4) Put B'Owl to bed     |");
			System.out.println("| 5) Bathe B'Owl          |");
			System.out.println("| 6) Throw away B'Owl     |");
			System.out.println("| 7) Show B'Owl's Status  |");		
			System.out.println("| 8) Quit                 |");		
			System.out.println("|-------------------------|");
			System.out.printf("\n\n");
			System.out.printf(": ");
			userin = input.nextLine();
			if(userin.equals("1")){
		

				System.out.println("|-------------------------|");
				System.out.println("|        Play Time        |");
				System.out.println("|-------------------------|");
				System.out.println("| How long would you like |");
				System.out.println("| to play with B'Owl?     |");
				System.out.println("|-------------------------|");
				System.out.println("|****Enter time in hrs****|");
				System.out.println("|-------------------------|");
				System.out.printf("\n\n");
				System.out.printf(": ");
				if(userIn > 0){
					userIn = input.nextDouble();
					bowl.play(userIn);
					System.out.println("B'Owl screeches as you fling it in the air");
					System.out.println("Your ears may never heal");
					System.out.printf("\n\n");
				}//end if
				continue;				
			}//end if
			
			if(userin.equals("2")){

				while(loop2){

					System.out.println("|-------------------------|");
					System.out.println("|         Food Time       |");
					System.out.println("|-------------------------|");
					System.out.println("| Choose what you would   |");
					System.out.println("| like to feed B'Owl      |");
					System.out.println("|-------------------------|");
					System.out.println("| 1) Rotting flesh        |");
					System.out.println("| 2) A can                |");
					System.out.println("| 3) Old Pizza            |");
					System.out.println("| 4) Debbie               |");
					System.out.println("| 5) Nothing              |");
					System.out.println("|-------------------------|");
					System.out.printf("\n\n");
					userin = input.nextLine();
					if(userin.equals("1"){
						feed(.375 * 7);
						System.out.println("B'Owl excitedly consumes the flesh");
						System.out.printf("\n\n");
						continue;
					}//end if
					if(userin.equals("2")){

						feed(.125 * 7);
						System.out.println("B'Owl devours the can");
						System.out.println("It looks at you with hungry eyes");
						System.out.printf("\n\n");
						continue;
					}//end if
					if(userin.equals("3")){
						feed(.25 * 7);
						System.out.println("B'Owl eats the pizza");
						System.out.println("You are safe for now");
						System.out.printf("\n\n");
						continue;
					}//end if
					if(userin.equals("4")){
						feed(.5 * 7);
						System.out.println("B'Owl's hunger has been satiated");
						System.out.printf("\n\n");
						continue;
			
					}//end if
					if(userin.equals("5")){
						System.out.printf("\n\n");
						loop2 = false;
						
					}//end if
				}//end while
				continue;
			}//end if
			if(userin.equals("3")){
				
				System.out.println("|-------------------------|");
				System.out.println("|       Sleepy Time       |");
				System.out.println("|-------------------------|");
				System.out.println("| How long should B'Owl   |");
				System.out.println("| Sleep?                  |");
				System.out.println("|-------------------------|");
				System.out.println("|****Enter time in hrs****|");
				System.out.println("|-------------------------|");
				System.out.printf("\n\n");
				System.out.printf(": ");
				userin = input.nextLine();
				
			}//end if



	


		}//end while loop
	}//end menuBowl

}//end B-Owl class


