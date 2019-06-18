#ifndef DATE_H_EXISTS
#define DATE_H_EXISTS


class Date{
	private:
		char * graduation;
		char * dob;
	public:
		Date();
		void setGrad(char*);
		void setBirth(char*);
		char * getGrad();
		char * getBirth();		
};//end Date

#endif
