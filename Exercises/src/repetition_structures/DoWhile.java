package repetition_structures;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		
		int runAgain = 0;
		
		
		do {
			System.out.println("Write a number");
			double number1 = user.nextDouble();
			
			System.out.println("Write a second number");
			double number2 = user.nextDouble();
			
			double finalResult = number1 + number2;
			System.out.println("Here's your total: " + finalResult);
			
			System.out.println("-------Wanna play again? Write 1 to continue or 0 to exit the game.----");
			runAgain = user.nextInt();
			
		} while(runAgain == 1);
		
		user.close();
	}

}
