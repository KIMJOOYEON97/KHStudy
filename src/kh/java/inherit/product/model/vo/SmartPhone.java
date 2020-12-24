package kh.java.inherit.product.model.vo;

public class SmartPhone extends Product {
	
	private String carrier;
	private String os;
	
	
	public SmartPhone() {
		
	}

	public SmartPhone(String brand, String productName, int price, 
			String os, String carrier) {
		//brand, productName, price 값대입
		//부모생성자 호출
		super(brand,productName,price);
		
//		setBrand(brand);
//		setProductName(productName);
//		setPrice(price);
		this.os =os;
		this.carrier = carrier;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	public String getSmartPhoneInfo() {
		return getProductInfo() +", " +os+", "+ carrier;
	}
}
