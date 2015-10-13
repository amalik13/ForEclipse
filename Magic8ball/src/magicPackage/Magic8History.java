package magicPackage;

import java.util.ArrayList;

public class Magic8History {

	ArrayList<String> questions = new ArrayList<String>(); 
	ArrayList<String> answers = new ArrayList<String>(); 
	
	public void SaveQuestion(String ques)
	{
		
		questions.add(ques);
		
	}
	
	public void SaveAnswers(String ans)
	{
		
		answers.add(ans);
		
	}
	
	public void printHistory()
	{
		for(int i =0; i<questions.size();i++)
		{
			System.out.print("Question :"+questions.get(i)+"\t\t");
			System.out.println("Answer :"+answers.get(i));
		}
	}
}
