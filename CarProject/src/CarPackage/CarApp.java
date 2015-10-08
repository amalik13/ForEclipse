package CarPackage;

import java.io.ObjectInputStream.GetField;

public class CarApp {
	
	public static void main(String[] args) {
		
		 String Name = "Porche";
		 String modelYear = "2008";
		 String speed="100";
		 String acceraltion="100";
		
		
		CarClass c1 = new CarClass(); //default values call constructor
		CarClass c2 = new CarClass();
		c2.setName(Name);
		c2.setModelYear(modelYear);
		c2.setSpeed(speed);
		System.out.println(c1.getCarInfo());
		System.out.println("------------------------");
		System.out.println(c2.getCarInfo());
	}

}
