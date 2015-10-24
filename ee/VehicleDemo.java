
// This class declares an object of type Vehicle.
class VehicleDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		int range;
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		// compute the range assuming a full tank of gas
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers +
					" with a range of " + range);
		}
}
