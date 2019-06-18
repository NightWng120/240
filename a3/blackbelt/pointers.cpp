#include <iostream>
#include <cstdlib>




void printValues(int number, int * count);
void lane(int * ptr);


int main()
{
int seed;
int AR[] = {0, 0, 0, 0, 0};
int * ptr = AR;


	std::cout<<"Please enter a seed: "<<std::endl;

	std::cin>>seed;
	
	srand(seed);
	lane(ptr);
	






	return 0;
}

void printValues(int number, int * count)
{
int i;
	for(i = 0; i < 14; i++)
	{
		if(*count == i)
		{
			std::cout<<number;

		}
		std::cout<<".";
		


	}
	
	std::endl (std::cout);
}

void lane(int * ptr)
{
int i;
int * start;
bool x = true;

start = ptr;

	while(x)
	{
		for(i = 0; i < 5; i++)
		{
			if(rand()%2)
			{
				*ptr = *ptr + 1;
				printValues(i, ptr);
			}
			else
				printValues(i, ptr);
			
			ptr++;
		}
		ptr = start;
		for(i = 0; i < 5; i++)
		{
			
			
                	if(*ptr == 15)
                	{
                		std::endl (std::cout);
                		std::endl (std::cout);
				std::cout<<"Horse "<<i<<" wins!"<<std::endl;
				x = false;
			}
		
			ptr++;
		}
		ptr = start;
			std::endl (std::cout);
			std::endl (std::cout);


	}






}
