#include <iostream>
#include <cstdlib>
#include <time.h>

int AR[] = {0, 0, 0, 0, 0};//Horse posistion array

void printValues(int number, int count);//PrintValues function prototype
int lane();//Lane function prototype


int main()
{
int bet; //Initialization of bet variable
int horse;//Initialization of chosen horse variable
int winner;//Initialization of winning horse variable
int i;//For loop counter variable assignment
std::string answer;//Yes or no string variable	
std::string garbage;//Enter key string variable
std::string diff;//Difficulty choice string variable
int bank;//Bank variable intialization
bool loop = true;//While loop bool initialization

	
	
		std::cout << "Welcome to Blazing Stables!" << std::endl;
		std::cout << "where the men put their money where their mouth is" << std::endl<<std::endl;
		/*Title print out*/
		std::cout << "Choose your difficulty:"<<std::endl<<std::endl;
		std::cout << "Farm Hand" <<std::endl<<std::endl << "Cowboy" <<std::endl<<std::endl << "Horse Whisperer" <<std::endl<<std::endl;
		/*Difficulty prompt*/
		getline(std::cin, diff);//Difficulty prompt read

		if(diff == "Farm Hand" || diff == "farm hand" || diff == "farmhand")//If condition for farm hand choice
		{
			bank = 10000;//Bank assignment		
			
		}//end if

		else if(diff == "Cowboy" || diff == "cowboy")
		{
			bank = 5000;
		}//end else if

		else if(diff == "Horse Whisperer" || diff == "horse whisperer" || diff == "horsewhisperer")
		{
			bank = 1000;
		}//end else if

		srand(time(0));//Random function seeding with current time

	while(loop)//Input while loop
	{
		std::cout << "Would you like to make a bet?(y/n)" << std::endl;//Betting choice prompt
		getline(std::cin, answer);//Betting choice read
	
	
		if (answer == "y" || answer == "Y")//If condition for y
		{
			std::cout << "Great! How much would you like to bet?:" << std::endl << std::endl;
			std::cout << "$";
			/*Bet amount prompt*/
			std::cin >> bet;//Bet amount read
			std::cout << "Would you like to bet on horse 0, 1, 2, 3, or 4?:"<<std::endl;//Horse choice prompt
			std::cin >> horse;//Horse choice read
		
		}//end if

		else if (answer == "n" || answer == "N")//If condition for n
		{
			std::cout << "Then enjoy the race!" << std::endl;//User prompt;
		}
		else//Else for invalid data
		{
			std::cout << "Invalid input, please try again" << std::endl << std::endl;//Invalid data prompt
			continue;//Loop continue
		}//end else
	

		
		winner = lane();//Winner initialization and lane function call
		
		
		if(horse == winner)//If condition for chosen horse equaling winning horse
		{
			bet = bet*2;//Doubling of bet amount
			bank = bank + bet/2;//Addition of winnings to bank

			std::cout << "Congratulations!" <<std::endl;
			std::cout << "Here is your $"<<bet<<"!"<<std::endl;
			/*Printing of winnings*/
			std::cout << "Current bank amount: $"<<bank<<std::endl;//Bank amount printout
			
		}//end if
		else if (horse != winner)//If condition for chosen horse not equaling winning horse
		{
			bank -= bet;//Subracting bet amount from bank total
			std::cout << "Aww, too bad you didn't win"<<std::endl;
			std::cout << "Try again to test your luck!" << std::endl;
			std::cout << "Current bank amount: $" <<bank<< std::endl;
			/*Bank amount print out*/
		}//end else if
		if(bank <= 0)//If condition for bank amount being 0 or less
		{
			std::cout << "Sorry, but you're out of money partner" << std::endl;
			std::cout << "You'll have to bet again another day" << std::endl;
			/*Print out to user*/
			return 0;//Program exit
		
		}//end if
		std::cin.ignore();//Clearing of input stream		

		std::cout << "Press enter to continue" <<std::endl<<std::endl;//Input pause
		
		getline(std::cin, garbage);//Pause read

		std::cout << "Would you like to play again?(y/n)" << std::endl;//Game continue user prompt
		
		

		getline(std::cin, answer);//User choice read
		
		if(answer == "y" || answer == "Y")//If condition for y choice
		{	
			for(i = 0; i < 5; i++)//For loop that runs for size of array
				AR[i] = 0;//Horse position reassignment	
			
			continue;//Loop continue
		}
		if(answer == "n" || answer == "N")//If condition for n choice
		{
			std::cout << "Thanks for playing!"<<std::endl<<std::endl;//User prompt
			loop = false;//Loop break out
		}
	}




	return 0;
}//end main

void printValues(int number, int count)//PrintValues function body
{
int i;//Counter variable initialization
	for(i = 0; i < 14; i++)//For loop that runs for size of lane
	{
		if(count == i)//Position check test condition
		{
			std::cout<<number;//Prints horse to screen at ith position in lane

		}//end if
		std::cout<<".";//Dot printout
		


	}//end forloop
	
	std::endl (std::cout);//Newline
}//end printvalues

int lane()//Lane function body
{
int i;//For loop counter variable initialization
int winner;//Horse winner variable initialization
bool loop = true;//While loop boolian value

	while(loop)//While loop that runs until bool is false
	{
		for(i = 0; i < 5; i++)//Position increment for loop that runs for size of array
		{
			if(rand()%2)//If condition for when rand function returns 1
			{
				AR[i] = AR[i] + 1;//Increment of position counter
				printValues(i, AR[i]);//Function call of print values function
			}//end if
			else//Else condition for when rand function returns 0
				printValues(i, AR[i]);//Only calls print value function without incrementing position counter
			
		}//end for loop
			
		for(i = 0; i < 5; i++)//Win condition for loop that runs for size of array
                {
			
			
            		if(AR[i] == 15)//If condition when position 
                	{
				winner = i;//Winner assignment
				std::endl (std::cout);
				std::endl (std::cout);
				/*New line characters*/
				std::cout<<"Horse "<<i<<" wins!"<<std::endl;//Prints out winning horse
				loop = false;//Sets bool to false
			}//end if
		}//end for loop

			std::endl (std::cout);
			std::endl (std::cout);
			/*New line characters*/


	}//end while





return winner;
}//end lane 
