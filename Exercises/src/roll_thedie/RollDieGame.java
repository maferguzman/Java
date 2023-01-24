package roll_thedie;

import java.util.Scanner;
import java.util.Random;

public class RollDieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner to interact with the user
		Scanner enter = new Scanner(System.in);
		
		//Presentation of the game
		System.out.println("Welcome to die the roll game, you have five chances to reach 20 spaces." + "\n" + "Are you ready?");
		int user = 0;
		
		//Do while user input == 1 (Keep playing)
		do {
			
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
				
				//Calculate the spaces left by updating the variable spaces minus the number of the die each round
				spaces -= die;
				
				//Add the total of numbers (update variable)
				currentSpace += die; //The variable I want to upgrade on the right side
				
				//STOP THE GAME if the number of rolls overpasses 20 spaces and go to the "if-else" in line 56 to declare a lost game.
				if (currentSpace > 20) {
					break;
				}
				
				//Print with each loop
				System.out.println("You've rolled a N°" + die + " You are now in space " + currentSpace + " You have " + spaces + " more to go.");
			
			}
			
			//CREATE AN IF STATEMENT, only if the user makes exactly 20 spaces he wins.
			if(currentSpace == 20) {
				System.out.println("Congratulations you've won :)");
			}
			else { //There's only one way to win, if the user makes == 20 within 5 rounds, anything else is a loss.
				System.out.println("Sorry,You've lost. Try again.");
			} 
			
			
			//Play again
			System.out.println("Write 1 to continue or 0 to exit the game");
			user = enter.nextInt();
			
		} while(user == 1);
		
		enter.close();
		
	}

}
