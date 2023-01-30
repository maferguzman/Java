package passingdata;

import java.util.Scanner;

public class CreditCheck {

	public static void main (String[] args) {
		System.out.println("Welcome to --Quick Loans & Credits Sanchez--" + "\n" + "Please answer these questions to see if you're eligible for a credit");
		
		//instantCredit(28000, 500); PASSING ARGUMENTS DIRECTLY TO THE METHOD
		
		//Creating a Scanner to receive data
		Scanner userInput = new Scanner(System.in);
		
		//Ask user for their salary
		System.out.println("Please enter your yearly salary");
		int salary = userInput.nextInt();
		
		//Ask user for their credit score
		System.out.println("Please enter your credit score");
		int creditScore = userInput.nextInt();
		
		//close scanner
		userInput.close();
		
		//The order of the arguments must match the order of the parameter list
		creditWithScanner(creditScore, salary); 
		
	}
	
	
	//create a method that approves anyone who makes more than $25,000 and has a credits score of 700 or better
	//reject all others
	public static void instantCredit(int earningsUser, int creditScoreUser) {
		
		//Declare variables
		int earningsPerYear = 25000;
		int creditScore = 700;
		
		//Check eligibility
		if (earningsUser > earningsPerYear && creditScoreUser >= creditScore) {
			System.out.println("Congratulations you're eligible for a credit!");
		} else if (creditScoreUser <= creditScore) {
			System.out.println("Sorry, due to your low Credit Score you have not been approved");
		} else if (earningsUser < earningsPerYear) {
			System.out.println("Sorry, your credit can't be approved if you don't make the minimun earning per year");
		} else {
			System.out.println("Contact with one of our agents for more information.");
		}

	} 
	
	//Another way of doing it using the Scanner
	public static void creditWithScanner(int creditScore, int salary) {
		//declaring variables
		int requiredSalary = 25000;
		int requiredCreditScore = 700;
		
		//checking requirements from user vs the standard
		if (creditScore >= requiredCreditScore && salary >= requiredSalary ) {
			System.out.println("Congrats you obtained the credit");
		} else {
			System.out.println("Sorry, you've been not approved for a credit");
		}
	}
	
	
	
}
