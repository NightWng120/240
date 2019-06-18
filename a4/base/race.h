#include <iostream>
#include "horse.h"
#ifndef RACE_H_
#define RACE_H_
/*Race class prototype initalization*/
class Race{
	private:
		Horse h[5];
		int length;
	public:
		Race();
		Race(int length);
		void printLane(int HorseNum);
		void start();



};

#endif
