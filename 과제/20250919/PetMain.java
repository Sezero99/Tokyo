package Hw;

public class PetMain {

	public static void main(String[] args) {
		
		// 주석이 있으면 더 좋을 것 같아요 ^^ 
		// 주석을 다는 습관이 있으면 더 좋은! 
		// 나머지는 너무 멋져요!! 
		PetDAO dao = new PetDAO();
		PetService service = new PetService(dao);
		PetController controller = new PetController(service);
		
		controller.run();

	}

}
