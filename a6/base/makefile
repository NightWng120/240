HeapOstudents: main.o student.o date.o address.o
	g++ -g main.o student.o date.o address.o -o HeapOstudents

main.o: main.cpp student.h address.h date.h
	g++ -g -c main.cpp
student.o: student.cpp student.h date.h address.h
	g++ -g -c student.cpp
date.o: date.h
	g++ -g -c date.cpp
address.o: address.h
	g++ -g -c address.cpp
debug: HeapOstudents
	gdb -tui ./HeapOstudents
valgrind: HeapOstudents
	valgrind --leak-check=full ./HeapOstudents

run: HeapOstudents
	./HeapOstudents
clean:
	rm *.o
	rm HeapOstudents
	rm shortreport.txt
	rm fullreport.txt
	rm alphareport.txt
	touch shortreport.txt
	touch fullreport.txt
	touch alphareport.txt
