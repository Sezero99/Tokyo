package Hw;

public class VehickeMain {

	public static void main(String[] args) {
        // 자동차 객체 생성
        Car car = new Car();
        car.setSpeed(80); // 속도 설정
        car.move();
        System.out.println("자동차 속도: " + car.getSpeed() + "km/h");

        System.out.println();

        // 자전거 객체 생성
        Bicycle bicycle = new Bicycle();
        bicycle.setSpeed(10); // 속도 설정
        bicycle.move();
        System.out.println("자전거 속도: " + bicycle.getSpeed() + "km/h");
    }

}
