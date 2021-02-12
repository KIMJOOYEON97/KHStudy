package mobile;

public class Otab extends Mobile {

	
	
	
	public Otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otab(String moblieName, int batterySize, String osType) {
		super(moblieName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize() - (time*12));
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize() + (time*8));
		return getBatterySize();
	}

}
