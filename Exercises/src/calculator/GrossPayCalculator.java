package calculator;

import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner usuario = new Scanner(System.in);
		
		int hours;
		int payRate;
		
		//Get the number of hours worked
		System.out.println("---Number of hours worked---");
		
		hours = usuario.nextInt();
		
		//Get the hourly pay rate
		System.out.println("---Hourly pay rate---");
		
		payRate = usuario.nextInt();
		
		//Multiply hours by pay rate and display result to the console
		System.out.println("Your salary should be: $" + (hours * payRate));
		
		usuario.close();

	}

}
