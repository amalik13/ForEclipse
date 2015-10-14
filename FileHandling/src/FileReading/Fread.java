package FileReading;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class Fread {
	
public static void main(String[] args) throws IOException{
	
	 //get a filename
	 String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");

	 //write to a file
	 PrintWriter writer = null;
	 writer = new PrintWriter(new File(filename));
	 writer.println("this is a string");
	 writer.close();

	 //read a file
	 BufferedReader reader = new BufferedReader(new FileReader(filename));
	 String line = reader.readLine();
	 System.out.println(line);
	 reader.close();
	 try{
	       throw new MyException(2);
	       // throw is used to create a new exception and throw it.
	  }
	 catch(MyException e){
	    System.out.println(e) ;
	 }
	 catch (Exception e) {
		   System.out.println("someCode");
		}
	 finally
	 {
		 System.out.println("we are in finally");
	 }
	}
	}
	class MyException extends Exception{
	   int a;
	   MyException(int b) {
	     a=b;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	  }
	


}