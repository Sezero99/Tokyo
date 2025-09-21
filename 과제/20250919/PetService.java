package Hw;

import java.util.List;


public class PetService {
	
	private PetDAO dao;

	public PetService(PetDAO dao) {
		this.dao = dao;
	}
	
	// DAO(저장소)에 저장된 전체 회원 반환
	public List<PetDTO> getAllPet() {
		
		return dao.findAll();
		
	}
	
	// 리스트 추가를 위한 구체적인 회원 등록
    public void addPet(String id, String protector, int age, String num) {
		
		PetDTO dto = new PetDTO(id, protector, age, num); // 인스턴스로 만들어줘야함
		dao.save(dto);
		
	}

}
