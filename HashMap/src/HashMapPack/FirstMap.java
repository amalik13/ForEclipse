package HashMapPack;

import java.util.*;

public class FirstMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		int number=0;
/*		myMap.put(1,"The value is one");
		myMap.put(2,"The value is two");
		myMap.put(3,"The value is three");
		myMap.put(4,"The value is four");
		myMap.put(5,"The value is five");
		myMap.put(6,"The value is six");
		myMap.put(7,"The value is seven");
		myMap.put(8,"The value is eight");
		myMap.put(9,"The value is nine");
		myMap.put(10,"The value is ten");*/
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		 number = scan.nextInt();
		//while(number>=1 && number<=10)
		{NumberToWord obj = new NumberToWord();
		
		/* System.out.println(myMap.get(number));
		 System.out.println("enter the number");*/
		 //number = scan.nextInt();
		 
		 System.out.println("*** " + obj.convert(number));
		}
		
		
	}

}
