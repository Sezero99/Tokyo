package Hw;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodDAO dao = new FoodDAO();
		FoodService service = new FoodService(dao);
		FoodController controller = new FoodController(service);
		
		controller.run();

	}

}
