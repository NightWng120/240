#include "address.h"
#include <cstdlib>
#include <string.h>








Address::Address(){

	char ar[] = " ";
	char* str = ar;


	Address::zip= str;
	Address::add1= str;
	Address::add2= str;
	Address::state= str;
	Address::city= str;
}//end constructor







void Address::setZip(char* zipin){
	strcpy(Address::zip, zipin);
}//end setZip

void Address::setAddOne(char* addonein){

	strcpy(Address::add1, addonein);
}//end setAddOne

void Address::setAddTwo(char* addtwoin){

	strcpy(Address::add2, addtwoin);
}//end setAddTwo

void Address::setCity(char* cityin){

	strcpy(Address::city, cityin);
}//end setCity

void Address::setState(char* statein){

	strcpy(Address::state, statein);
}//end setState

char* Address::getZip(){

	return Address::zip;
}//end getZip

char* Address::getAddOne(){
	return Address::add1;
}//end getAddOne

char* Address::getAddTwo(){
	return Address::add2;
}//end getAddTwo

char* Address::getCity(){
	return Address::city;
}//end getCity

char* Address::getState(){
	return Address::state;
}//end getState


