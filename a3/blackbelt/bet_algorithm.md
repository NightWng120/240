# **Main Function**  

## Goal  

To prompt user to answer yes no questions, choose difficulty level, enter bets, and horse choice. 
  
## Steps  
* Make a while loop that runs while a bool is true  

* Prompt user on which difficulty level they would like to play on  

* Inside of while loop, prompt user asking them if they would like to make a bet  

* Have yes condition allow them to continue on to enter bet amount and enter horse that they are betting  
  on  
  
* Have no condition allow player to observe the race    

* Have condition where if an invalid value is inputted that the loop restarts  

* Call lane function and set its returned value equal to the winner variable

* Have if condition when horse is equal to winner to double the bet amount, add half of the doubled amount  
  added to the seleced bank size, printout the new bet amount, and print out the current bank total  
  
* Have else if statement for when horse is not equal to winner to subtract the inputted bet amount from the  
  bank total and print out the current bank total  
  
* Have if condition for when bank total is less than zero and return 0, ending the program  

* Clear input stream with cin.ignore function  

* Have program pause using getline function

* Prompt the user to choose whether or not to play again and read their answer with getline

* Have if condition for when their answer is y to reassign 0 to each elemnt of the array and to continue the loop

* Have second if condition for when their answer is n to set boolian to false, ending the loop

# **Print Values Function**  

## Goal  

Prints the current lane with the position of the number to  
the screen.  


## Input  

Takes input from values passed by the lane function  


## Output  

Prints current lane with number position to the screen  

## Steps  

* Initialize a counter variable for for loop  

* Run for loop for 14 iterations  

* Have if statement in for loop that tests for the position of the  
	number in the lane and prints number to screen if true  

* Outside of if statement print dot to screen  

* Outside of for loop print a newline character  





# Lane Function  

## Goal  

Runs random function in for loop to determine whether or not the horse moves  
and checks for a win condition  

## Steps  

* Initialize counter variable for for loop and initialize boolean for while loop  

* Run while loop until boolean variable is false  

* Run for loop for the size of the array  

* Have an if condition for when rand function returns 1 where the position is incremented  
	by one and the printValues function is called  

* Have else statement for when function is false to just call printValues function  

* Have second for loop inside of while loop that runs for size times and checks if the current  
	element is in the last postion and prints that the ith horse has won the race if true  
	and sets bool to false to end the while loop  
