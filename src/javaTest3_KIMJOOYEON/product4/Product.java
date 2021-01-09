package javaTest3_KIMJOOYEON.product4;

public class Product {
	
	String name ="";
	int price =0;
	int quantity =0;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
	public void infomation() {
		System.out.println("상품명 :"+name+"\n"+"가격 :"+price+"원\n"
						+"수량 :"+quantity+"개\n"+"총 구매 가격 :"+price*quantity+"원");
	}
		
		


}
