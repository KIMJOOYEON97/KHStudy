package javaTest3_KIMJOOYEON.airplane9;

public abstract class Plane {

	private String planeName;
	private int fuelSize;
	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	//주유
	public void refuel(int fuel) {
		fuelSize += fuel;
	}
	
	public abstract void flight(int distance) ;
	
}
