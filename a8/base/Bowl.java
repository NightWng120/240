
import java.util.*;
import java.io.*;

class Bowl{


	public static void main(String[] args){

		new Bowl();
	}//end main

	public Bowl(){
			
		try{
			
			Scanner infile = new Scanner(new File("bowl.txt"));
			while(infile.hasNextLine()){

				System.out.println(infile.nextLine());
			}//end while loop

		

		}
		catch(FileNotFoundException ex){
			System.out.println("Bad stuff happened");
		}//end catch
		


	}//end constructor








}//end class Bowl
