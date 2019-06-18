#include "student.h"
#include <string.h>
#include <cstdlib>
#include <fstream>
#include <iostream>
#include <algorithm>


void alphaReport(Student s[]);

int main(){

int i;
Student* s = new Student[50];

	for(i = 0; i < 50; i++){
		s[i].fill();
	}//end for loop
	
	for(i = 0; i < 50; i++){
		s[i].fullReport(i);
	}//end for loop
	
	for(i = 0; i < 50; i++){
		s[i].shortReport();
	}//end for loop
	
	alphaReport(s);
	

	delete [] s;
}//end main

void alphaReport(Student s[]){

int i;
int j;
char* tempF1;
char* tempF2;
char* tempL1;
char* tempL2;
std::ofstream outfile;
	
	outfile.open("alphareport.txt");
	for(i = 0; i < 50; i++){
		for(j = 0; j < 49; j++){

			if(*s[j].getLastName() < *s[j+1].getLastName()){
				
				tempF1 = s[j].getFirstName();
				tempF2 = s[j+1].getFirstName();
				tempL1 = s[j].getLastName();
				tempL2 = s[j].getLastName();
				std::swap(tempF1, tempF2);
				std::swap(tempL1, tempL2);
				s[j].setName(tempF1,tempL1);
				s[j+1].setName(tempF2, tempL2);			
			}//end if
		}//end for loop
	}//end for loop

	for(i = 0; i < 50; i++){

		outfile << s[i].getName() << std::endl;
	}//end for loop

	
}//end alphaReport
