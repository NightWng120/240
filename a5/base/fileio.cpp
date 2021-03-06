#include <iostream>
#include <string.h>
#include <sstream>
#include <fstream>
#include <cstdlib>
#include <cstdio>
int main(){

std::ofstream outfile;//Out file object
std::ifstream infile;//In file object
std::string stringline;//String variable initialization
char line[80];//Number character array initialzation
char * tok;//String token initialization
int i;//For loop counter intiialization
int sum = 0;//Sum variable intitialization and assignment

	infile.open("test.txt");//infile object assignment
	outfile.open("output.txt");//outfile object assignment

	while(!infile.eof()){//While loop that runs until end of file
		
		infile.getline(line, 80);//Comma seperated numbers line read in
	
		tok = strtok(line, ",");//Tokenizatoin of line
		while(tok != NULL){//While loop runs until the end of the tokenized string
			sum += atoi(tok);//Converts token string to number and adds to sum
			tok = strtok(NULL, ",");//Sets token to next tokenized element
		}//end while
		std::getline(infile, stringline);//String line read in
		
		for(i  = 0; i < sum; i++){//For loop runs sum times


			outfile << stringline;//Placing of string into output file

			if(i != (sum-1)){//if condition for when i is not sum - 1
				outfile << ",";//Comma printout
			}//end if
		}//end for loop
		outfile << std::endl;
		outfile << std::endl;
		/*New line characters*/
		sum = 0;//Resetting sum

	}//end while
	infile.close();
	outfile.close();
	/*infile and outfile closes*/
	return 0;
}
