package magicPackage;

import java.util.Scanner;

public class MagicApp {

	public static void main(String[] args) {
		String message = "";
		String Question = "";
		magic8Class obj1 = new magic8Class();
		
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("...............Welcome to the 8 Ball game........... ");
		System.out.println(" Write the question and I shall have the answer for you");
		
		Question = Keyboard.next();
		System.out.println("");
		 message = obj1.shakeit();
		 System.out.println( "MAGIC 8-BALL SAYS: " + message );
		
	}
}
