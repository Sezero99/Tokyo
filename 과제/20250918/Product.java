package Hw;

public class Product {
	
	// 필드
	private String name;
	private int price;
	
	// 생성자
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
	
	@Override
	public String toString() {
		return "Product [이름 = " + name + ", 가격 = " + price + "]";
	}
}
