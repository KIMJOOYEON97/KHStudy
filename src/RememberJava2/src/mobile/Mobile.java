package mobile;

public abstract class Mobile {

	private String moblieName;
	private int batterySize;
	private String osType;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String moblieName, int batterySize, String osType) {
		super();
		this.moblieName = moblieName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	public String getMoblieName() {
		return moblieName;
	}
	public void setMoblieName(String moblieName) {
		this.moblieName = moblieName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	//사용
	public abstract int operate(int time) ;
	
	//충전
	public abstract int charge(int time) ;
}
