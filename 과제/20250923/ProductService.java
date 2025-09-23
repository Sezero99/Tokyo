package ch3;

import java.util.List;

// 상품명, 수량, 가격, 상품번호
public class ProductService {
	
	private ProductDAO dao;
	
	// 의존성 주입 : 외부 DAO를 받아와 내부 변수로 저장. 교체 용이
	public ProductService(ProductDAO dao) {
		this.dao = dao;
	}
	
	// 전체 상품 출력
	public void printAll() {
        List<ProductDTO> list = dao.findAll();
        for (ProductDTO dto : list) {
            System.out.println(dto);
        }
    }
	
	 // 분석 (상품 개수, 전체 합계)
    public void analyze() {
        List<ProductDTO> list = dao.findAll();
        int totalSum = 0;
        for (ProductDTO dto : list) {
            totalSum += dto.getTotal();
        }
        System.out.println("전체 상품 개수: " + list.size());
        System.out.println("전체 상품 합계: " + totalSum);
    }
    
    // 상품 등록

	public void addProduct(String name, int qty, int price, int id, int total) {
		ProductDTO dto = new ProductDTO(id, name, qty, price); // 객체 생성
	    dao.save(dto);  // DAO에 저장
	    System.out.println("상품이 등록되었습니다: " + dto.getName());
		
	}
}
