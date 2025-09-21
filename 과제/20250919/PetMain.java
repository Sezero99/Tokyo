package Hw;

public class PetMain {

	public static void main(String[] args) {
		
		PetDAO dao = new PetDAO();
		PetService service = new PetService(dao);
		PetController controller = new PetController(service);
		
		controller.run();

	}

}
