package ch3;

import java.util.ArrayList;
import java.util.List;


public class ProductDAO {
	
	List<ProductDTO> productlist = new ArrayList<>(); //물건을 순차적으로 배열에 저장
	
	// 물건 한 개의 정보를 DTO에 전달받아 List에 추가
	public void save(ProductDTO dto) {
		
		productlist.add(dto);
	}
	
	// 저장된 물건 전체 목록을 호출 
	public List<ProductDTO> findAll() {
		
		return productlist;
		
	}
}
