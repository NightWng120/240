#include "race.h"
#include "horse.h"
#include <iostream>

/*First Race constructor body*/
Race::Race(){
	
	length = 15;//Assignment of a length variable
	
}

/*Second Race constructor body with length argument*/
Race::Race(int length){
	
	Race::length = length;//Assignment of value length to parameter length


}

/*printLane method body*/
void Race::printLane(int horseNum){

int i;//Counter variable intialization

	for(i = 0; i < Race::length; i++){//For loop that runs for length
		
		/*If condition that is true when horse object array element
 			horseNum's position is equal to counter variable*/
		if(Race::h[horseNum].getPosition() == i){
		
			std::cout << horseNum;//Printout of horseNum
		}
	
		std::cout << ".";//Lane dot printout


	}
	
	std::endl (std::cout);//New line character




}




/*start method prototype*/
void Race::start(){

int i;//Counter variable intialization
bool loop = true;//Boolian value intialization and assignment
	
	while(loop){//While loop that runs while bool is true

		for(i = 0; i < 5; i++){//For loop that runs for size of array

			Race::h[i].advance();//advance method call
			Race::printLane(i);//printLane method call

		}
		
		std::endl (std::cout);//New line character
	
		for(i = 0; i < 5; i++){//For loop that runs for size of array
			
			/*If condition for when ith horse object array element is equal to length*/
			if(Race::h[i].getPosition() == Race::length){

				/*New line characters*/
				std::endl (std::cout);
				std::endl (std::cout);
				
				std::cout << "Horse " << i << " wins!" << std::endl << std::endl;//Winning horse printout
				loop = false;//Bool assignment to false to end while loop
				

		
			}
		

		}



	}











}









