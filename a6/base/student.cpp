#include "student.h"
#include "date.h"
#include "address.h"
#include <iostream>
#include <string.h>
#include <string>
#include <cstdlib>
#include <fstream>
#include <string>

Student::Student(){
	
	Student::date = new Date;
	Student::address = new Address;	
	/*Initalization of date and address objects onto heap*/
	char ar[] = " ";//empty string initalization
	char* str = ar;//sting to pointer intitalization
		
	Student::firstName = str;//paramerter to ptr assignment
	Student::lastName = str;//paramerter to ptr assignment
	Student::gpa = str;//paramerter to ptr assignment
	Student::hours = str;//paramerter to ptr assignment
}//end constuctor

char* Student::getName(){//getName method
	
char * temp = Student::lastName;

	strcat(temp, Student::firstName);//concatanation of first and last names
	return temp;//destination return;
}//end getName
char* Student::getLastName(){//getLastName method
	return Student::lastName;//lastName return
}//end getLastName
char* Student::getFirstName(){//getFirstName method
	return Student::firstName;//firstName return
}//end getFirstName

void Student::setName(char* first, char* last){//setName method
	Student::firstName = first;//setting of firstName
	Student::lastName = last;//setting of lastName
	
}//end setName


void Student::fill(){//fill method for inserting data into object array
std::ifstream infile;//ifstream variable initialization
bool loop = true;//bool intialization
char* token;//token intialization
char line[100];//character array intialization
int ctr = 0;//counter variable intialization
	infile.open("student.dat");//ifstream file open
	
	infile.getline(line, 100);//assignment of line variabgle to line in .dat file
	token = strtok(line, ",");//token assignment
	
	while(loop){//while loop that runs while loop is true
	
		/*Assignment to char* variable at ctrth position*/
		if(ctr == 0){
			Student::lastName = token;
		}//end else if	
		else if(ctr == 1){
			Student::firstName = token;
		}//end else if
		else if(ctr == 2){
			address->setAddOne(token);
		}//end else if
		else if(ctr == 3){
			address->setAddTwo(token);
		}//end else if
		else if(ctr == 4){
			address->setCity(token);	
		}//end else if
		else if(ctr == 5){
			address->setState(token);
		}//end else if
		else if(ctr == 6){
			address->setZip(token);
		}//end else if
		else if(ctr == 7){
			date->setBirth(token);
		}//end else if
		else if(ctr == 8){
			date->setGrad(token);		
		}//end else if
		else if(ctr == 9){
			Student::gpa = token;
		}//end else if
		else if(ctr == 10){
			Student::hours = token;
			loop = false;//Setting of bool to false when last element is assigned
		}//end else if
	
		token = strtok(NULL, ",");//token increment sort of
		
		ctr++;//counter increment
	}//end while
	
	
}//end fill

void Student::shortReport(){//short report method
std::ofstream outfile;//ofstream assignment

char* temp = lastName;//temp value initialization to lastName

	strcat(temp, Student::firstName)
	outfile.open("shortreport.txt");//outfile file open
	outfile <<; temp//
	outfile.close();

}//end shortReport
void Student::fullReport(int i){
	std::ofstream outerfile;

	outerfile.open("fullreport.txt");
	outerfile << "Student Number " << i << std::endl;
	outerfile << "Name: " << Student::lastName << "," << Student::firstName << std::endl;
	outerfile << "Address line 1: " << address->getAddOne() << std::endl;
	outerfile << "Address line 2: " << address->getAddTwo() << std::endl;
	outerfile << "City: " << address->getCity() << std::endl;
	outerfile << "State: " << address->getState() << std::endl;
	outerfile << "Zip Code: " << address->getZip() << std::endl;
	outerfile << "Birthday: " << date->getBirth() << std::endl;
	outerfile << "Anticipated Graduation Date: " << date->getGrad() << std::endl;
	outerfile << "GPA: " << Student::gpa << std::endl;
	outerfile << "Credit Hours Complete: " << Student::hours << std::endl;
	outerfile.close();
}//end full report

Student::~Student(){

	delete(date);
	delete(address);

}//end desctructor
















