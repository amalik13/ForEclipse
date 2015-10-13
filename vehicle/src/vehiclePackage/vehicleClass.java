package vehiclePackage;

public abstract class vehicleClass {

	String name;

	public void vehicle()
	{
		System.out.println(" ...........New Vehicle..............");
	}
	
	
	
	public void which(String name)
	{
		System.out.println("What vehicle is this? "+name);
	}
	public void model(String name)
	{
		System.out.println("what model ? "+name);
	}
	public void starts()
	{
		System.out.println("the vehicle starts");
	}
	
	public void stops()
	{
		System.out.println("the vehicle stops");
		
	}
	
	public void accelerates()
	{
		System.out.println("vehicle accelerates");
	}
}
