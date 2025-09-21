package Hw;

import java.util.List;
import java.util.Scanner;

public class FoodController {
	
	Scanner sc = new Scanner(System.in);
	
	private FoodService service;
	
	public FoodController(FoodService service) {
		
		this.service = service;
		
	}
	
	public void run() {
		
		while(true) {
			
			System.out.println("번호 입력 : 1\n조회 : 2\n종료 :  0");
			System.out.print("번호를 입력해주세요 : ");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1:
				System.out.print("식자재번호 : ");
				int foodnum = sc.nextInt();
				System.out.print("식자재명 : ");
				String foodname = sc.next();
				System.out.print("수량 : ");
				int cnt = sc.nextInt();
				System.out.print("등록날짜 : ");
				String date = sc.next();
				
				service.addFood(foodnum, foodname, cnt, date);
				System.out.println("등록이 완료되었습니다!");
				break;
				
			case 2:
				showFood();
				break;
				
			case 0:
				System.out.println("프로그램이 종료됩니다");
				return;

			default:
				System.out.println("정해진 숫자만 입력해주세요");
				
			}
			
			
		}
	}
	
	void showFood() {
		
		List<FoodDTO> food = service.getAllFood();
		System.out.println("********");
		for(FoodDTO dto : food) {
			System.out.println(dto);
		}
		
	}

}
