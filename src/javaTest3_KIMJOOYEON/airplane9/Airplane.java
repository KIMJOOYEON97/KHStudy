package javaTest3_KIMJOOYEON.airplane9;

public class Airplane extends Plane{

	
	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	
	@Override
	public void flight(int distance) {
		if(distance %10 == 0) {
			int useFuelNum = distance/10;
			setFuelSize(getFuelSize()-(useFuelNum*30));
		}
	}

}
