package interface_08.lab05;

public class VehicleExample {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x)  ->  Vehicle에는 checkFare가 없음
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.chekFare();
	}

}
