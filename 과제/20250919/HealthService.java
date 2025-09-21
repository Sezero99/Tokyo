package Hw;

import java.util.List;

public class HealthService {
	
	private HealthDAO dao;
	
	public HealthService(HealthDAO dao) {
		
		this.dao = dao;
	}
		
	public List<HealthDTO> getAllHealth () {
		
		return dao.findAll();
	}
	
    public void addHealth(String name, int num, int standardcalorie, int consumecalorie) {
		
		HealthDTO dto = new HealthDTO(name, num, standardcalorie, consumecalorie); // 인스턴스로 만들어줘야함
		dao.save(dto);
	
	}

}
