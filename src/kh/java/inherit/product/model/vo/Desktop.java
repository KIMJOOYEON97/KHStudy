package kh.java.inherit.product.model.vo;

public class Desktop extends Product {
	
	private String os;
	private String monitor;
	private String keyboard;
	
	public Desktop() {
		
	}

	/**
	 * brand, productName, price, os, monitor, keyboard
	 * 
	 * Desktop d = new Desktop("삼성","삼성대탑","윈도우",1_000_000,
	 * 							"27인치 종은거","기계식키포드") //이런식으로 객체를 생성
	 */
	public Desktop(String brand, String productName, int price, 
					String os, String monitor,String keyboard) {
		
		//상속받은 public메소든는 현재객체 소속인것처럼 사용가능
		this.setBrand(brand);
		setProductName(productName); //this가 생략되어있다. 내꺼야 데스크탑꺼야
		setPrice(price);
		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
		
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return super.toString()+", "+os+", " +monitor+", "+keyboard;
	}
	public String getDesktopInfo() {
//		return getBrand() +", " +getProductName() + ", "+getPrice() +", "
//				+os+", " +monitor+", "+keyboard;
		
		return getProductInfo()
				+", "+os+", " +monitor+", "+keyboard;
		
	}
		
	
}
