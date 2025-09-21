package Hw;

import java.util.List;

public class FoodService {
	
	private FoodDAO dao;

	public FoodService(FoodDAO dao) {
		this.dao = dao;
	}
	
	public List<FoodDTO> getAllFood() {
		return dao.findAll();
	}
	
	public void addFood(int foodnum, String foodname, int cnt, String date) {
		
		FoodDTO dto = new FoodDTO(foodnum, foodname, cnt, date);
		
		dao.save(dto);
		
	}

}
