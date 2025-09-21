package Hw;

import java.util.ArrayList;
import java.util.List;

public class PetDAO {
	
	/*
	 * 순서가 있는 배열로 크기 조절 가능
	 * List
	 * 인터페이스
	 * 
	 * Array
	 * 클래스
	 * 
	 * .add(추가), .remove(삭제), .size(데이터 갯수), .get(읽기)
	 */
	
	// 회원정보를 순서대로 저장
	// [MemberDTO(한라봉), MemberDTO(진지향), MemberDTO(레드향)...]
	private List<PetDTO> petList = new ArrayList<>();
	
	// 회원 한 명의 정보를 받아 memberList에 추가
	public void save(PetDTO dto) {
		
		petList.add(dto);
		
	}
	
	public List<PetDTO> findAll() {
		
		return petList;
	}
	
}
