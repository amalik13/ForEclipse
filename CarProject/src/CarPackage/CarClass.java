package CarPackage;

public class CarClass {
	private String Name;
	private String accelration;
	private String speed;
	private String modelYear;
	
	CarClass()
	{
		 Name = "Mercedez Benz";
		 modelYear = "2008";
		 speed="100";	
		 accelration = "60";
	}
	
	public String getAccelration() {
		return accelration;
	}
	public void setAccelration(String accelration) {
		this.accelration = accelration;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	public String getCarInfo()
	{
		System.out.println("the name of the car is :"+Name);
		System.out.println();
		System.out.println("Starting the car now");
		System.out.println();
		System.out.println("the car can accelerate at :"+accelration);
		System.out.println();
		System.out.println("model year	speed");		
		
		return modelYear + "\t\t" + speed;
		
	}
	
}
