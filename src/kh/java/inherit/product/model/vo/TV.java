package kh.java.inherit.product.model.vo;

public class TV extends Product {
	
	private int size; //인치
	private int channel;

	//생성자
	public TV() {
//		super(); 생략가능
	}
	public TV(String brand, String productName, int price,int size, int channel) {
		super(brand, productName, price);
		this.channel = channel;
		this.size = size;
	}
	
	public String getInfo() {
		return getProductInfo()+ ", " +size +", "+channel;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	

	
	
}
