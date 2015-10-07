package vehiclePackage;

public class Car extends vehicleClass {
public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.vehicle();
		car1.which("it's a Car");
		car1.model("it's porche");
		car1.starts();
		car1.accelerates();
		car1.stops();
}
}
