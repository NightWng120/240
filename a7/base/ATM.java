import java.util.*;
import java.io.*;

class ATM{

	public Vector<User> vecUser;
	public Admin admin;
	/*User and Admin object declarations*/

	public static void main(String[] args){
		new ATM();//ATM object declaration
	}//end main
	
	public ATM(){
		
		vecUser = new Vector<User>();
		admin = new Admin();
		/*Object assignments*/
		
		load(vecUser);//Not working anymore
		menuAll(admin, vecUser);//menuAll method call
		save(vecUser);//Trash
		
	}//end ATM constructor
	
	public int menuAll(Admin admin, Vector<User> vecUser){//menuAll passed admin and user vector and returns integer
		Scanner input = new Scanner(System.in);//Scanner object intialization
		String userIn;//Input string initialization
		boolean loop = true;//Bool initialization
		
		while(loop){//While loop runs while bool is true
	
			System.out.println("-----------------");
			System.out.println("****ATM  Login***");
			System.out.println("1) Admin Login   ");
			System.out.println("2) User Login    ");
			System.out.println("3) Exit          ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			/*GUI formatting*/
			userIn = input.nextLine();//User input read
			if(userIn.equals("1")){//if statement for first option
				menuAdmin(admin, vecUser);//menuAdmin method call
				continue;
				
			}//end if

			else if(userIn.equals("2")){//if statement for second option

				menuUser(vecUser);//menuUser method call
				continue;
			}//end else if
			else if(userIn.equals("3")){//if statement for third option

				return 0;//method returns 0
			}//end else if

		}//end while loop	
		return 0;
	}//end menuAll

	public int menuAdmin(Admin admin, Vector<User> vecUser){//menuAdmin is passed admin object and user vector object and returns integer

		Scanner input = new Scanner(System.in);//Scanner object initialization
		String userIn;
		String userInIn;
		String buffer;
		String name;
		/*String initializatoins*/
		boolean loop1 = true;
		boolean loop2 = true;
		/*Bool initializations*/	
		int ctr = 0;
		int num;
		int i;
		/*Integer initializations*/


		while(loop1){//While loop for admin login, and password and account number input

	


			System.out.println("-----------------");
			System.out.println("***Admin Login***");	
			System.out.println("-----------------");
			System.out.println("Enter Password   ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			/*GUI formatting*/
			userIn = input.nextLine();//First administrative user read in	
			System.out.printf("%n");
			System.out.println("Enter Account #  ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			/*GUI formatting*/
			userInIn = input.nextLine();//Second administrative user read in
			
			if(userIn.equals(admin.getPin()) && userInIn.equals(admin.getNum())){//if returns true if both inputs match admin credentials
				
					loop1 = false;//loop is ended
			}//end if
                	else if(userIn.equals("q")){//secret boi
				
				return 0;

			}//end else if
				
		}//end while loop		

		while(loop2){//While loop for admin option menus

						
			System.out.println("1) Add User      ");
			System.out.println("2) Delete User   ");
			System.out.println("3) List Users    ");
			System.out.println("4) Set interest  ");
			System.out.println("5) Exit          ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			/*GUI formatting*/
                	userIn = input.nextLine();//Administrative user read in
			
			
			if(userIn.equals("1")){//if condition for first option
				
				System.out.println("Please enter user name");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*User name entry prompt*/
				userIn = input.nextLine();//Administrative user read in

				vecUser.add(new User());//Object creation and addition to User vector
			
				vecUser.lastElement().setName(userIn);//Assignment of User name

				System.out.println("Please set pin #");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*User pin entry prompt*/
				userIn = input.nextLine();//Administrative user read in
									
				vecUser.lastElement().setPin(userIn);//Assignment of User pin
				
				System.out.println("Please set account #");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*User account number entry prompt*/
				userIn = input.nextLine();//Administrative user read in
				
				vecUser.lastElement().setNum(userIn);//Assignment of User account number
				System.out.println("Press Enter to continue");//
				buffer = input.nextLine();
				
				continue;	
			}//end if

			else if(userIn.equals("2")){//Else if for option 2
				System.out.println("Please enter user to be deleted");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*Prompt for user deletion*/
				userIn = input.nextLine();//Administrative user read in

				for(i = 0; i < vecUser.size(); i ++){//For loop that runs for number of elements in user object vector
					if(vecUser.get(i).getName().equals(userIn)){//If condition for when input matches User object name

						vecUser.remove(i);//object removal from vector					
	
					}//end if

				}//end for loop	
				
				System.out.println("Press Enter to continue");
				buffer = input.nextLine();
				continue;	
			}//end else if
			else if(userIn.equals("3")){//Else if for option 3
				System.out.printf("%n%n");
				System.out.println("----------Users----------");
				System.out.printf("%n");
				/*User list heading*/
				for(i = 0; i < vecUser.size(); i++){//for loop for listing all useers

						System.out.println("User #" + i + ": " + vecUser.get(i).getName());//formatted printing of user names			
						System.out.println("Pin #: " + vecUser.get(i).getPin());
						System.out.println("Acccount #: " + vecUser.get(i).getNum());
						System.out.printf("Checking: $%.2f%n", vecUser.get(i).getCheck());
						System.out.printf("Savings: $%.2f%n", vecUser.get(i).getSave());
						System.out.println("-------------------------");
						System.out.printf("%n");
				}//end for loop		
				System.out.printf("%n%n");
	
				System.out.println("Press Enter to continue");
				buffer = input.nextLine();	
				continue;

			}//end else if
			
			else if(userIn.equals("4")){//else if for option 3
				
				System.out.println("Please enter user name");
				System.out.printf("%n%n");
				System.out.printf(": ");
				name = input.nextLine();

				for(i = 0; i < vecUser.size(); i++){


					if(vecUser.get(i).getName().equals(name)){
						System.out.println("Enter time value");//Prompt to enter time value for interest
						userIn = input.nextLine();//Adminstrative user read in
						System.out.println("Enter rate value");//Prompt to enter interest rate value 
						userInIn = input.nextLine();//Administrative user read in
                                                
						System.out.println("Press Enter to continue");//
						buffer = input.nextLine();	
					}//end if
				}//end for loop
				continue;
				
			}//end else if
			else if(userIn.equals("5")){//Fifth else if option exits admin menu

				return 0;

			}//end else if
			else if(userIn.equals("6")){
				
				admin.setPin(input.nextLine());
				admin.setNum(input.nextLine());
				
			}//end else if

		}//end while loop
		
		return 0;
	}//end menuAdmin
	public int menuUser(Vector<User> vecUser){//menuUser is passed User vector and returns integer
		
		Scanner input = new Scanner(System.in);//Scanner object initialization
		String userIn;
		String userInIn;
		//String initializations
		boolean loop = true;
		boolean pool =  true;
		boolean theway;
		//Bool intializations
		int i;
		int num = 0;
		//Integer intializations
		double buffer;
		double in;
		//Double intializations

		while(pool){//While loop for user credential input
			
			System.out.println("Enter pin #      ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			userIn = input.nextLine();
			System.out.println("Enter account #  ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			/*Pin and account entry prompt*/
			userInIn = input.nextLine();//User input	
		
			for(i = 0; i < vecUser.size(); i++){//for loop for credential comparasion
				
				if(vecUser.get(i).getPin().equals(userIn) && vecUser.get(i).getNum().equals(userInIn)){//credential comparasion
		
					num = i;
					pool = false;//Loop ends when credentials are correct
				}//end if 

			}//end for loop
			System.out.printf("%n%n");
		}//end while loop

		while(loop){//While loop for user option menus
 		      	System.out.println("-----------------");
 		       	System.out.println("1) View balance  ");
 		       	System.out.println("2) Deposit       ");
 		       	System.out.println("3) Withdraw      ");
 		       	System.out.println("4) Exit          ");
			System.out.printf("%n%n");
			System.out.printf(": ");
			/*GUI formatting*/
			userIn = input.nextLine();//User input
			if(userIn.equals("1")){//if condition for first option
			
				System.out.println("1) View Checking ");
				System.out.println("2) View Savings  ");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*View blance option menu*/
				userInIn = input.nextLine();//user input
				System.out.printf("%n%n");
				if(userInIn.equals("1")){//if condiiton for first view balance option

					System.out.printf("Checking: $%.2f%n%n%n", vecUser.get(num).getCheck());//checking balance printout
				}//end if				
				
				else if(userInIn.equals("2")){//if condition for second view balance option
					
					System.out.printf("Savings: $%.2f%n%n%n", vecUser.get(num).getSave());//savings balance printout

				}//end else if
				continue;

			}//end if
			else if(userIn.equals("2")){//if condition second option
				
				System.out.println("1) Deposit Checking ");
				System.out.println("2) Deposit Savings  ");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*Deposit option menu*/
				userInIn = input.nextLine();//User input
				System.out.printf("%n%n");
				if(userInIn.equals("1")){//if condition for first deposit option
				
				
					System.out.println("Enter deposit amount");
					System.out.printf("%n");
					System.out.printf(": ");
					/*Deposit for checking entry prompt*/
					in = input.nextDouble();//User input
					
					if(in > 0){
						buffer = vecUser.get(num).getCheck();
						buffer = buffer + in;
						vecUser.get(num).setCheck(buffer);
						/*Balance calculation and assignment*/
						continue;
					}//end if
					System.out.println("Balance cannot be negative");
					continue;
				}//end if
			
				else if(userInIn.equals("2")){//if condition for second deposit option

		
					System.out.println("Enter deposit amount");
					System.out.printf("%n");
					System.out.printf(": ");
					/*Deposit for savings entry prompt*/
					in = input.nextDouble();//User input
					
					buffer = vecUser.get(num).getSave();
					buffer = buffer + in;
					vecUser.get(num).setSave(buffer);
					/*Balance calculation and assignment*/
				}//end else if
				continue;
			}//end else if
 		       
			else if(userIn.equals("3")){//if condition for third option
			
				System.out.println("1) Withdraw Checking ");
				System.out.println("2) Withdraw Savings  ");
				System.out.printf("%n%n");
				System.out.printf(": ");
				/*Withdrawal menu prompt*/
				userInIn = input.nextLine();//User input
				System.out.printf("%n%n");
				if(userInIn.equals("1")){//if condition for first withdrawal option

					System.out.println("Enter withdrawal amount");
					System.out.printf("%n");
					System.out.printf(": ");
					/*Withdrawal for checking entry prompt*/
					in = input.nextDouble();//User input
					
					buffer = vecUser.get(num).getCheck();
					buffer = buffer - in;
					vecUser.get(num).setCheck(buffer);
					/*Balance calculation and assignment*/
				}//end if
				else if(userInIn.equals("2")){
					
					System.out.println("Enter withdrawal amount amount");
					System.out.printf("%n");
					System.out.printf(": ");
					/*Withdrawal for savings entry prompt*/
					in = input.nextDouble();//User input
					
					buffer = vecUser.get(num).getSave();
					buffer = buffer - in;
					vecUser.get(num).setSave(buffer);
					/*Balance calculation and assignment*/
				}//end else if 
				continue;
			}//end else if
			else if(userIn.equals("4")){//Last if condition for exiting user menus
				loop = false;
				return 0;
			}//end else if
			for(i = 0; i < vecUser.size(); i++){

				vecUser.get(i).setSave(vecUser.get(i).getSave());		


			}//end for loop
        	}//end while loop
		
		return 0;
	}//end menuUser
	



	/*Methods were working before, but now they're broken so yeah*/
	
	public void load(Vector<User> vecUser){
		
		int i;
		int size;
		String file;
		double dFile;
		try{
			Scanner infile = new Scanner(new File("conn.txt"));
			size = infile.nextInt();
			infile.nextLine();
			for(i = 0; i < size; i++){
				vecUser.add(new User());				
				file = infile.nextLine();
				vecUser.lastElement().setName(file);
				file = infile.nextLine();
				vecUser.lastElement().setPin(file);
				file = infile.nextLine();
				vecUser.lastElement().setNum(file);
				dFile = infile.nextDouble();
				vecUser.lastElement().setCheck(dFile);
				dFile = infile.nextDouble();
				vecUser.lastElement().setSave(dFile);
				infile.nextLine();
			}//end for loop
			infile.close();		
		





		}catch(FileNotFoundException ex){
				
			System.out.println("You lost, you're dead");
			
		}//end catch


		
	}//end load
	public void save(Vector<User> vecUser){
		
			File file = new File("conn.txt");
			int i;
			
			try{
				PrintWriter outfile = new PrintWriter(file);
				outfile.println(vecUser.size());	
				for(i = 0; i < vecUser.size(); i++){		
					outfile.println(vecUser.get(i).getName());
					outfile.println(vecUser.get(i).getPin());
					outfile.println(vecUser.get(i).getNum());
					outfile.println(vecUser.get(i).getCheck());
					outfile.println(vecUser.get(i).getSave());
				}
				outfile.close();		
			}catch(FileNotFoundException ex){
				System.out.println("SUCKS");
				System.out.println(" TO  ");
				System.out.println("SUCK");

			}//end catch
	}//end save


}//end ATM class































