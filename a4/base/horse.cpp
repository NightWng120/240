#include "horse.h"
#include <cstdlib>
#include <iostream>
/*Horse constructor body*/
Horse::Horse(){
	
	Horse::position = 0;//Intial assignment of position


}


/*advance method body*/
void Horse::advance(){

	if(rand()%2){//If condition returns true when rand is 1
		Horse::position++;//Postition increment when if condition is true

		
	}



}


/*getPosition method body*/
int Horse::getPosition(){

	

	/*Current position return*/
	return position;
}
