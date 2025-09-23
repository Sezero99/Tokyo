package ch3;


/*
 * 상품관리 프로그램
 *  1. 상품 등록 : 상품명, 수량, 가격, 상품번호
 *  2. 전체 상품 조회 : 상품번호, 상품명, 수량, 가격, 합계
 *  3. 개별 상품 조회 : 원하는 번호 입력 시 해당 상품만 출력
 *  4. 상품 정보 삭제 : 원하는 번호 입력 시 해당 상품만 삭제
 *  5. 상품 정보 수정 : 원하는 번호 입력 시 해당 상품만 수정 (상품번호는 수정하지 x)
 *  6. 상품 분석 :전체 상품의 갯수, 전체 상품의 합계
 *  0. 프로그램 종료
 *  
 *  1, 2, 6, 0번은 가능함
 */

public class ProductDTO {
	
	private int id; //상품 번호
	private String name; // 상품명
	private int qty; // 수량
	private int price; // 가격
	private int total; // 합계(qty * price)
	
	public ProductDTO(String name2, int qty2, int price2, int id2, int total2) {}
	
	public ProductDTO(int id, String name, int qty, int price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.total = qty * price; // 자동계산
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
		setTotal(); // 자동 갱신
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		setTotal(); //자동 갱신
	}

	public int getTotal() {
		return total;
	}
	
	// 수량 , 가격이 바뀔 때마다 자동 계산
	public void setTotal() {
		this.total = this.qty * this.price;
	}
	
	// 가격, 합계의 수에 세자리마다 (,) 표기
	String formatMoney(int money) {
		return String.format("%,d원", money);
	}
	/*
	 *%d -> 정수 세자리마다 쉼표(,)를 자동으로 넣어줌
	 *%.2f -> 
	 *%s
	 */
	@Override
	public String toString() {
		//return "상품번호 : " + id + ", 상품명 : " + name + ", 수량 : " + qty + ", 가격 : " + price + ", 합계 : " + total;
		return String.format("번호:%d, 상품명:%s, 수량:%d, 가격:%s, 합계:%s", id, name, qty, formatMoney(price), formatMoney(total));
	}
	
}
