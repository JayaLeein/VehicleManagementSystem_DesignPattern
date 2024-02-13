package designPatterns;

public class Bus implements VehicleBuilder{
	private Bus boat = new Bus();

	@Override
	public void buildEngine() {
		Engine busEngine = new Engine("Boat Engine");
		
	}

	@Override
	public void buildSteeringWheel() {
		SteeringWheel busSteeringWheels = new SteeringWheel(2);
		
	}

	@Override
	public Vehicle getVehicle() {
		return bus;
	}

}
