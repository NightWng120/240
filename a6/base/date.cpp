#include "date.h"
#include <string.h>
#include <cstdlib>


Date::Date(){

	char ar[] = " ";
	char* str = ar;

	Date::graduation = str;
	Date::dob = str;

}//end constructor

void Date::setGrad(char* input){
	strcpy(Date::graduation, input);

}//end setGrade

void Date::setBirth(char* in){
	strcpy(Date::dob, in);
}//end setBirth

char* Date::getBirth(){
	return Date::dob;
}//end getBirth

char* Date::getGrad(){
	return Date::graduation;
}//end getGrad
