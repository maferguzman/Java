package roll_thedie;

import java.util.Scanner;
import java.util.Random;

public class RollDieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner to interact with the user
		Scanner enter = new Scanner(System.in);
		System.out.println("Welcome to die the roll game, you have five chances to reach 20 spaces." + "\n" + "Are you ready?" + "\n" + "Write 1 to continue or 0 to exit the game");
		
		//Generate a Random Number
		Random diceNumber = new Random();
		
		
		//Make the spaces in the board
		int spaces = 20;
		
		//Declaring a new variable to save all the values of --die--
		//MUST DECLARE OUTSIDE OF THE LOOP, OR IT WILL START THE COUNT AT ZERO EVERY TIME AND IT WILL NOT ADD UP THE NUMBERS
		int currentSpace = 0; 
		
		//Create a for loop to go trough five die rolls and add every number
		for(int i = 0; i < 5; i++) {
			//Initialize a variable to save random number (inside the for loop to go x5 times)
			int die = diceNumber.nextInt(6) + 1;
			
			
			//NO SE ESTA ACTUALIZANDO LOS AVANCES DE ESPACIO
			
			
			//Print with each loop
			System.out.println("You've rolled a number: " + die);
			
			//Calculate the spaces left
			int spacesLeft = spaces - die;
			System.out.println("You have " + spacesLeft + " more to go.");
			
			//Add the total of numbers (update variable)
			currentSpace += die; //The variable I want to upgrade on the right side 
			System.out.println("You are now in space " + currentSpace);
		}
		enter.close();
		
	}

}
