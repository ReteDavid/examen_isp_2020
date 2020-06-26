package the_exam;

class Car
{
	private String color;
	
	public void start() {}
	public void stop() {}
	public void go() {}
	
}

class User
{
}
class Windshield
{
}
class CarMaker
{
}
class Wheel
{
}
public class Vehicle extends Car{

	public static void main(String[] args) {
		Car car = new Car();
		User user = new User();
		Windshield shield = new Windshield();
		CarMaker maker = new CarMaker();
		Wheel wheel = new Wheel();
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.stop();
		vehicle.go();

	}

}
