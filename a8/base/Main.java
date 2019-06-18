import java.util.*;



class Main{

	public static void main(String[] args){
		new Main();
	}//end main
	public Main(){
		menuAll();

	}//end Main
	public void menuAll(){
		
		Scanner input = new Scanner(System.in);
		String userin;
		boolean loop = true;
		
		while(loop){


			
			System.out.println("|-------------------------|");
			System.out.println("|       Welcome to        |");
			System.out.println("|    My New Pet Pet!      |");
			System.out.println("|-------------------------|");
			System.out.println("|    Choose your pet      |");
			System.out.println("|-------------------------|");
			System.out.println("| 1) B'Owl                |");
			System.out.println("| -B'Owl is great for the |");
			System.out.println("| whole family and perfect|");
			System.out.println("| for throwing away!      |");
			System.out.println("|                         |");
			System.out.println("| 2) Liger                |");
			System.out.println("| -The liger is a magestic|");
			System.out.println("| beast and will grant you|");
			System.out.println("| access to it's magical  |");
			System.out.println("| powers if cared for the |");
			System.out.println("| right way               |");
			System.out.println("|                         |");
			System.out.println("| 3) Exit                 |");
			System.out.println("|-------------------------|");
			System.out.printf("\n\n");
			System.out.printf(": ");
			userin = input.nextLine();
			if(userin.equals("1")){
					

				System.out.println("What would you like to name your B'Owl?");
				System.out.printf("\n\n");
				System.out.printf(": ");
				BOwl bowl = new BOwl(input.nextLine());
				bowl.menuBowl();

						
			}//end if
			if(userin.equals("2")){

				System.out.println("What would you like to name your Liger?");
				System.out.printf("\n\n");
				System.out.printf(": ");
				Liger liger = new Liger(input.nextLine());
				liger.menuLiger();
			}//end if
			if(userin.equals("3")){

				loop = false;
			}//end if
			

		}//end while loop

	}//end menuAll


}//end Main class
































