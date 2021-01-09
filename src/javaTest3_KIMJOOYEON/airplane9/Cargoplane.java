package javaTest3_KIMJOOYEON.airplane9;

public class Cargoplane extends Plane{

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		if(distance %10 == 0) {
			int useFuelNum = distance/10;
			setFuelSize(getFuelSize()-(useFuelNum*50));
		}
	}

}
