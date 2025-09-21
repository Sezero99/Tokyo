package Hw;

import java.util.List;
import java.util.Scanner;


public class PetController {
	
	Scanner sc = new Scanner(System.in);
	
	private PetService service;

	public PetController(PetService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			
			System.out.println("번호 입력 : 1 - 회원등록, 2 - 회원조회, 0 - 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1:
				
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("보호자명 : ");
				String protector = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("연락처 : ");
				String num = sc.next();
				
				service.addPet(name, protector, age, num);
				System.out.print("회원 등록 완료");
				break;
				
			case 2:
				showPet();
				
			case 0 :
				System.out.println("프로그램을 종료합니다");
				return; //프로그램 즉시 종료
				
			default:
				System.out.println("정해진 숫자만 입력해주세요");
			}
		
		}
		
		
	}
	
	void showPet() {
		List<PetDTO> pet = service.getAllPet(); //와 개어려워
		
		for(PetDTO dto : pet) { // member 리스트에서 순차적으로 꺼내 dto에 담아 출력
			
			System.out.println(dto);
		}
	}
	
}
