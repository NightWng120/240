# **Main Function**  

## Goal  

To Promppt the user to enter the seed for the random function  
and to call the lane function.  
  
## Steps  

* Prompt user to enter a seed  

* Enter seed into srand function  




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




