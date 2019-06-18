# **Main Function**  

## Goal:  

To prompt the user to enter a seed value and to call  
the start method  

## Output:  

A statement prompting the user to input seed value

## Steps:  

* Include horse and race header files  

* Initialize seed variable and Race object 

* Prompt user to enter a seed value, read in seed  
 value, and call start method  

# **Horse Class Header**

## Goal:  

To declare class variables, method prototypes, and constructor  
prototypes  

## Steps:  

* In Horse class declare position variable in private part of class  

* In public, declare Horse constructor, advance method, and getPosition method  

# **Horse Class C++ File**  

## Goal:  

To declare values for variables and define method prototypes  

## Output:  

GetPostion function returns current position when called  

## Steps:  

* In contructor, Horse(), initialize postition as zero  

* In advance method, only increment position if the rand() function returns a 1  

* In getPositon method, return the current position  

# **Race Class Header**  

## Goal:  

To declare variables and method prototypes  

## Steps:  

* In private, declare an array of horse objects, and length variable of type int  

* In public, delcare Race constructors, printLane method, and start method prototypes  

# **Race Class C++ File**  

## Goal:  

To model a horse race by printing each lane change to screen with the use of the Horse class  

## Output:  

Prints out each subsequent lane change of a horse race to screen and determines winner based upon it  

## Steps:  

* In Race constructor with no argument, declare length as 15 and then assign length parameter length  
	value  

* In printLane method, have an integer argument of horseNum and initialize counter variable  

* Make a for loop that runs for length times and have an if condition for when horse array at element horseNum  
	is equal to counter variable

* When if condition is true print out horseNum  

* In start function, intialize counter variable and boolian value set to true  

* Have while loop that runs when bool is true, and a for loop that runs until size of array  

* In for loop call advance method with horse array object, and call printLane method  

* Have a second for loop that runs for size of array and make an if condition for when the ith horse object elements  
	position is equal to the length of the track

* When if condition is true, print out winning horse and set while loop bool to false  






























































