#include <iostream>
#include <cstdlib>


int AR[] = {0, 0, 0, 0, 0};//Global array initialization

void printValues(int number, int count);//Lane printing function prototype
void lane();//Lane position moving function prototype


int main()
{
int seed;//Initialization of seed variable

	std::cout<<"Please enter a seed: "<<std::endl;//Prompt for user to enter seed value

	std::cin>>seed;//Seed value read
	
	srand(seed);//Random function seeding
	lane();//Lane function call
	






	return 0;
}//end main

void printValues(int number, int count)//PrintValues function body
{
int i;//Counter variable initialization

	for(i = 0; i < 14; i++)//For loop that runs for the size of lane
	{
		if(count == i)//Position check test condition
		{
			std::cout<<number;//Prints horse to screen at ith position in the lane

		}
		std::cout<<".";//Dot printout
		


	}
	
	std::endl (std::cout);//Newline
}//end printvalues

void lane()//Lane function body
{
int i;//For loop counter variable intiialization
bool loop = true;//While loop boolian value intialization

	while(loop)//While loop that runs until bool is false
	{
		for(i = 0; i < 5; i++)//Posistion increment for loop that runs for size of array
		{
			if(rand()%2)//If condition for when rand function returns 1
			{
				AR[i] = AR[i] + 1;//Increment of position counter
				printValues(i, AR[i]);//Function call of print values function
			}
			else//Else condition for when rand function returns 0
				printValues(i, AR[i]);//Only calls print value function without incrementing posistion counter
			
		}
			
			for(i = 0; i < 5; i++)//Win condition for loop that runs for size of array
                        {

                                if(AR[i] == 15)//If condition when position counter is at the last position in the lane
                                {
                                        std::endl (std::cout);
                                        std::endl (std::cout);
					/*New line characters*/
                                        std::cout<<"Horse "<<i<<" wins!"<<std::endl;//Prints out winning horse
                                        loop = false;//Sets bool to false
                                }
                        }

			std::endl (std::cout);
			std::endl (std::cout);
			/*New line characters*/

	}






}//end lane
