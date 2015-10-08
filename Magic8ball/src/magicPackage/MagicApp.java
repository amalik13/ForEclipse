package magicPackage;

import java.util.Scanner;

public class MagicApp extends magic8Class{

	public static void main(String[] args) {
		String message = "";
		String Question = "";
		String option = "1";
		MagicApp obj1 = new MagicApp();
		Magic8History history = new Magic8History();
		System.out.println("...............Welcome to the 8 Ball game........... ");
		
		
		while("1".equalsIgnoreCase(option))
			
		{
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println(" Write the question and I shall have the answer for you");
		
		Question = Keyboard.nextLine();
		history.SaveQuestion(Question);
		System.out.println("");
		message = obj1.shakeit();
		history.SaveAnswers(message);
		System.out.println( "MAGIC 8-BALL SAYS: " + message );
		
		System.out.println("press button for the option 1) Play again 2) Show History 3) exit");
		 option = Keyboard.nextLine();
		while (option.equalsIgnoreCase("2"))
		{
			history.printHistory();
			System.out.println("press button for the option 1) Play again 2) Show History 3) exit");
			option = Keyboard.nextLine();
			
		}
		//Keyboard.close();
		}
		
		
	}
}
