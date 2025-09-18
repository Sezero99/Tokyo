package Hw;

public class Car implements Vehicle {
	
	private int Speed;

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	@Override
	public void move() {
		
		System.out.println("자동차가 도로를 달립니다");
		
	}
	
	
	
	
	

}
