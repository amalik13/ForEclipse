package vehiclePackage;

public class train extends vehicleClass{

	public static void main(String[] args) {
		train train1 = new train();
		train1.vehicle();
		train1.which("it's a train");
		train1.model("Bullet train");
		train1.starts();
		train1.accelerates();
		train1.stops();
	}
	
}
