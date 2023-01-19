package fill_theblank;

import java.util.Scanner;

public class FillTheBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		
		//String adjective;
		//String season;
		//int number;
		
		
		System.out.println("-------------Write an adjective-------------");
		//adjective = entry.nextLine();
		String adjective = entry.nextLine();
		
		System.out.println("-------------Write a season of the year-------------");
		//season = entry.nextLine();
		String season = entry.nextLine();
		
		System.out.println("-------------Write a whole number-------------");
		//number = entry.nextInt();
		int number = entry.nextInt();
		
		entry.close();
		
		System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffe.");
	}

}
