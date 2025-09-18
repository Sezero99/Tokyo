package Hw;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setPassword("abc123");
		
		System.out.println("비밀번호 : " + box.getPassword());

	}

}
