#ifndef ADDRESS_H_EXISTS
#define ADDRESS_H_EXISTS

class Address{
	private:
		char* zip;
		char* add1;
		char* add2;
		char* city;
		char* state;
	public:
		
		Address();
		void setZip(char*);
		void setAddOne(char*);
		void setAddTwo(char*);
		void setCity(char*);
		void setState(char*);
		char* getZip();
		char* getAddOne();
		char* getAddTwo();
		char* getCity();
		char* getState();




};//end Address class

#endif
