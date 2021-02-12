package mobile;

public class Ltab extends Mobile{

	
	
	
	public Ltab() {
		super();
	}

	public Ltab(String moblieName, int batterySize, String osType) {
		super(moblieName, batterySize, osType);
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
