package ch3;

import java.util.List;
import java.util.Scanner;

// 사용자의 입,출력 관리
public class ProductController {
	
	Scanner sc = new Scanner(System.in);
	private ProductService service;
	
	public ProductController(ProductService service) {

		this.service = service;
	}
	
	public void run() {
		
		while (true) {
			System.out.println("번호 입력 : 1 - 상품등록, 2 - 전체 상품 조회, 3 - 개별 상품 조회, 4 - 상품 정보 삭제, 5 - 상품 정보 수정, 6 - 상품 분석, 0 - 프로그램 종료" );
		
		int q = sc.nextInt();
		switch (q) {
		case 1: addProduct(); break;
		case 2: outAllProduct(); break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: analyzeProduct(); break;
		case 0: System.out.println("프로그램 종료"); return;

		default:
			System.out.println("숫자만 입력하세요");
		}
		
		
		}
	}

	private void analyzeProduct() {
		ProductDAO dao = new ProductDAO();
		List<ProductDTO> list = dao.findAll();
        
        if (list.isEmpty()) {
            System.out.println("등록된 상품이 없습니다.");
            return;
        }

        int totalSum = 0;
        for (ProductDTO dto : list) {
            totalSum += dto.getTotal();  // getTotal() = qty * price
        }
        
        System.out.println("전체 상품 개수: " + list.size());
        System.out.println("전체 상품 합계: " + totalSum);
    }
		

	private void addProduct() {
		
		System.out.println("상품명 : ");
		String name = sc.nextLine();
		System.out.println("수량 : ");
		int qty = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		System.out.println("상품 번호 : ");
		int id = sc.nextInt();
		System.out.println("합계 : ");
		int total = sc.nextInt();
		
		service.addProduct(name, qty, price, id, total);
        System.out.println("상품 등록 완료!");
		
	}
	
	private void outAllProduct() {
		
		service.printAll();
		
	}

}
