package magicPackage;

import java.util.Random;

public class magic8Class
{
	static String response[] = new String[21];
	public void Message ()
	{
		
		//String response[] = new String[21];
			response[0] = "It is certain";
		
			response[1] = "It is decidedly so";
		
			response[2] = "Without a doubt";
		
			response[3] = "Yes - definitely";
		
			response[4] = "You may rely on it";
		
			response[5] = "As I see it, yes";
		
			response[6] = "Most likely";
		
			response[7] = "Outlook good";
		
			response[8] = "Signs point to yes";
		
			response[9] = "Yes";
		
			response[10] = "Reply hazy, try again";
		
			response[11] = "Ask again later";
		
			response[12] = "Better not tell you now";
		
			response[13] = "Cannot predict now";
		
			response[14] = "Concentrate and ask again";
		
			response[15] = "8-BALL ERROR!";
			
			response[16] = "Don't count on it";
			
			response[17] = "My reply is no";
			
			response[18] = "My sources say no";
			
			response[19] = "Outlook not so good";
			
			response[20] = "Very doubtful";
			

			
	}

	  public String shakeit() {
		Random r = new Random();
		
		
		
		int choice = 1 + r.nextInt(20);
		Message();
		
		return response[choice];
		
		// TODO Auto-generated method stub
		
	}
}