#include "horse.h"
#include "race.h"
#include <cstdlib>





int main(){

int seed;
Race begin; 

	std::cout << "Please enter a seed value:" << std::endl;
	std::cin >> seed;
	std::endl (std::cout);
	srand(seed);
	begin.start();










return 0;
}
