package vehiclePackage;

public class boat extends vehicleClass{

	public static void main(String[] args) {
		boat boat1 = new boat();
		boat1.vehicle();
		boat1.which("it's a boat");
		boat1.model("Fishing Boat");
		boat1.starts();
		boat1.accelerates();
		boat1.stops();
	}
	
	
}
