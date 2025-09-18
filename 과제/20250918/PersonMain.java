package Hw;

public class PersonMain {

	public static void main(String[] args) {
		
		Person[] people = new Person[5];
		
		 for (int i = 0; i < people.length; i++) {
	            people[i] = new Person(); // 객체 생성
	        }
		 
		    people[0].setName("이채연");
	        people[0].setAge(26);

	        people[1].setName("허수현");
	        people[1].setAge(27);

	        people[2].setName("장선호");
	        people[2].setAge(28);

	        people[3].setName("손효정");
	        people[3].setAge(25);

	        people[4].setName("권소령");
	        people[4].setAge(25);

	        // get 메서드로 정보 출력
	        System.out.println("=== 마을 주민 명단 ===");
	        for (int i = 0; i < people.length; i++) {
	            System.out.println("이름: " + people[i].getName() + ", 나이: " + people[i].getAge());
	        }
	}

}
