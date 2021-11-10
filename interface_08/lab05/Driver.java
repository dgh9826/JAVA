package interface_08.lab05;

public class Driver {
	
	public void drive(Vehicle vehicle) {
			if(vehicle instanceof Bus) {
				Bus bus = (Bus) vehicle;
				bus.chekFare();
			}
		vehicle.run();
	}
}
