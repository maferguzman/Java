package find_letter;

import java.util.Scanner;

public class FindLetter {
	
	public static void main (String[] args) {
		
		
		//Ask the user for a word in the form of a String
		Scanner word = new Scanner(System.in);
		
		//Intructions for the user
		System.out.println("Enter a word");
		String text = word.nextLine();
		
		word.close();
		
		boolean letterFound = false;
		
		//Use the for loop and the length method to iterate trough all letters in a word
		//text.length() and text.charAt()
		for(int i = 0; i < text.length(); i++) {
			
			//declare a variable (currentLetter) to save the value of the length of the word the user entered (text.charAt)
			char currentLetter = text.charAt(i);
			//Compares if the letter in turn is equal to Uppercase or Lowercase 'a'
			if (currentLetter == 'A' || currentLetter == 'a') { 
				//If letter in turn happens to match an 'a', then change the value of the variable letterFound to be true (we initialized as false at the beggining of the loop)
				letterFound = true;
				System.out.println(letterFound);
				//Once the match is found break (STOP) the loop
				break; 
			}
			//Print the currentLetter and his position for every iteration
			System.out.println("The letter " + currentLetter + " is in the position: " + i);
		}
		
		
	}
	
}
