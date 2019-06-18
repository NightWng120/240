# **Main Function**  

## Goal:  

To effectively parse the input file and use the information parsed to create an  
output file  

## Input:

An input txt file that has numbers and strings in an arranged format  

## Output:  

An output txt file that prints out each string for the sum of the numbers above them  
in the input file  

## Steps:  

* Variable intializations  
	
	- Initialize of and if stream variables and open them to their respective text documents
	- Intialize string, character array, and character token variables
	- Intitialize counter variable and sum variable and set equal to zero

* First while loop

	- Have loop run until EOF
	- Use ifstream variable getline method to read in first line of input document
	- Assign token variable to the strtok of the character array with comma delimiter

	* Second while loop  
		- Have loop run until token variable is NULL  
		- Set sum variable to the atoi of the current token
		- Reassign token variable to strtok of NULL and delimiter
	
	- Use standard getline function with ifstream variable and string variable arguments

	* For loop  
		- Have for loop run while i is less than the integer cast of sum  
		- Set ofstream variable to string variable
		
		* If statement
			- Have if condition be true when counter variable is not the integer cast of sum minus one  
			- Set ofstream variable equal to a comma string

- Close ofstream and ifstream variables
