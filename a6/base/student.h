#ifndef STUDENT_H_EXISTS
#define STUDENT_H_EXISTS

#include <iostream>
#include "date.h"
#include "address.h"
class Student{

	private:

		char* gpa; 
		char* hours; 
		char* firstName;
		char* lastName;
		Address * address;
		Date * date;
	public:
		
		Student();	
		char* getName();
		char* getLastName();
		char* getFirstName();
		void setName(char*, char*);
		void fill();
		void shortReport();
		void fullReport(int);
		~Student();
				


};//end student
#endif
