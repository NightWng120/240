# **User Class**  

## Goal

To hold individual user data and have retrieaval methods for that data  

## Input
The input methods of this class are the set Name, Check, Save, Pin, and Num methods   

## Output  
The output methods of this class are the get Name, Check, Save, Pin, and Num methods  

## Steps  

* Declare class attributes and objects  
* Initialize attributes in constructor and set object names equal to new object instances  
* Write getter and setter methods for each attribute and object  

# **Admin Class**  

## Goal  

To store admin information and to be able to edit admin pin and account number  
## Input  

The input methods for this class are setPin, and setNum which are for setting the pin  
	and the account number for the admin class  

## Output  

This function has no output methods  

## Steps  

* Declare account number and pin attributes  
* Set them equal to empty strings in constructor  
* Declare setter methods for account number and pin  

# **Checking Class**  

## Goal  

To store checking balance and allow for the retrieval and setting of the balance  

## Output  

This class can output the balance with the getBalance method  

## Input  

This class can take input for the setting of the balance with the setBalance method  

## Steps  

* Declare balance attribute  
* Set value attribute equal to zero in constructor
* Declare setter and getter for attribute  

# **Savings Class**  

## Goal  

To extend the Checking class by adding interest  

## Output  

This class outputs the the balance using the get balance method inherited from Checking class  

## Input  

This class allows input through the setBalance method and the setInt method  

## Steps  

* Declare time and rate attributes  
* Initialize attriubtes in constructor  
* Declare setter and getters for interest rate  

# **ATM Class**  

## Goal  

To house the menu methods for the Admin and User objects, and to house the load and save methods

## Output  

This class prints formatted menus to the screen and writes to file the contents of the user object when  
the program is terminated  

## Input  

This class takes input from the command console for menu traversal, and data input and also takes input  
when the program starts by reading the save file that is kept in the same directory  

## Steps  

* Declare Admin object and User object vector  
* Declare ATM object in main function  
* **Constructor**  
	- Initialize user vector object  
	- Intialize admin object  
	- Call load method  
	- Call menuAll method  
	- Call save method  
* **menuAll**  
	- Initialize Scanner object, String object, and boolean variable  
	- **While Loop**  
		- While loop runs for boolean variable  
		- Print out login menu  
		- Set string equal to input  
		- **If Statements**  
			- Make first if statement call menuAdmin method when true  
			- Make second if statement call menuUser when true  
			- Make third if statement exit program when true  
* **menuAdmin**  

	- Initialize Scanner object, String objects, boolean variables, and integer variables  
	- **While Loop**  
		- While loop runs while first boolean variable is true  
		- Print out Admin password log in
		- Set first string equal to input  
		- Print out Admin account number log in  
		- Set second string equal to input  
		- **If Statements**  
			- First statemnet is true when both Strings are equal to correct strings  
			- First statement sets bool to false  
			- Second statement is true when first input is q and returns 0 when true  
	- **While Loop**  
		- While loop runs while second bool is true  
		- Printout Admin menus  
		- Set first String equal to input  
		- **If Statement**  
			- If statement is true when first string is equal to first menu option  
			- Printout prompt to input name  
			- Set first String equal to input  
			- Add a user to vector object and call set name method from last vector element  
			- Printout prompt to set User pin  
			- Set first String variable to input  
			- Call set pin method from last vector element  
			- Printout prompt to set User account number  
			- Set first String variable to input  
			- Call set account number method from last vector element  
		- **Else If Statement**  
		- Else if is true when first String variable is first option  
		- Printout prompt to delete User  
		- Set first String variable to input  
		- **For loop**  
			- For loop runs for size of vector  
			- Have if condition for when the ith element in vector is equal to first String variable  
			- Remove vector element when if condition is true
		- **Else If Statement**  
		- Else if is true when first String variable is third option  
		- Printout User list heading  
		- Have for loop loop through vector and printout each User in formatted manner  
		- **Else If Statement**  
		- Else if is true when third String variable is fourth option  
		- Printout prompt to enter User name  
		- **For Loop**  
			- For loop runs for size of vector
			- **If Statement**  
				- If condition is true when ith vector element name is equal to third String variable  
				- Prompt to enter time value  
				- Set first String variable to input  
				- Prompt to enter rate value  
				- Set second String varaible to input  
		- **Else If Statement**  
			- Else if is true when the first String variable is fifth option  
			- Return 0
* **menuUser**  
	- Initialize Scanner object
	- Declare String objects  
	- Initialize bool variables  
	- Intialize integer variables  
	- Intialize double variables  
	- **While Loop**  
		- While loop is true while first bool is true  
		- Printout prompt to enter User pin  
		- Set first String to input  
		- Printout prompt to enter User account number
		- Set second String to input
		- **For Loop**  
			- For loop runs for size of vector  
			- **If Statement**  
				- If statement is true when ith vector element's pin is equal to first String variable and 
					ith vector element's account number is equal to second String variable  
				- Set second integer to i
				- Set fist bool to false
	- **While Loop**  
		- While loop runs while second bool is true  
		- Printout User menu prompt  
		- Set first String variable to input  
		- **If Statement**  
			- If statement is true when first String is first option  
			- Printout menu prompt  
			- Set second String variable to input  
			- Make if statement for first option printout Checking balance  
			- Make second if for the second option and printout Savings balance  
		- **Else If Statement**  
			- Else if is true when when first String variable is first option  
			- Printout menu prompt  
			- Set second String variable to input  
			- **If Statement**  
				- If condition for first option  
				- Printout prompt to enter deposit amount  
				- Set double variable to input  
				- Add input to current balance and set sum to new balance  
			- **Else If Statement**  
				- Else if conditition for second option  
				- Printout prompt to enter deposit amount  
				- Set double variable to input  
				-  Add input to current balance and set sum to new balance  
		- **Else if Statement**  
			- Else if condition for third menu option  
			- Prinout menu prompt  
			- Set second String variable to input  
			- **If Statement**  
				- If condition for first option  
				- Printout prompt to enter withdrawal amount  
				- Set double variable to input  
				- Subtract input from current balance and set difference to new balance  
			- **Else If Statement**  
				- Else if condition for second option  
				- Printout prompt ot enter withdrawal amount  
				- Set doube variable to input  
				- Subtract input from current balance and set difference to new balance  
		- Else if for fourth option to end loop and exit user menu  
* **Load**  
	- Declare integer and double variables and String object  
	- **Try**  
		- Intialize Scanner object to new File object  
		- Set size integer variable to first line of file  
		- Have for loop run for size of vector and read in the data for the ith user  
	- Catch catches FileNotFoundException  
* **Save**  
	- Declare File object to be save document, and declare counter integer variable  
	- **Try**  
	- Set a PrintWriter object to File object  
	- Write size to file  
	- Have for loop run for size of vector and write ith user data to file  
* Catch FileNotFound Exception  



