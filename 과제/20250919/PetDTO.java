package Hw;

/*
 * 요구사항
 * 회원정보 : 아이디, 보호자, 나이, 연락처
 * 기능 :
 *    회원등록(입력)
 *    전체 회원 조회(출력)
 *    *프로그램 종료*
 * 
 */

public class PetDTO {
	
	String id;
	String protector;
	int age;
	String num;
	
	
	public PetDTO(String id, String protector, int age, String num) {
		super();
		this.id = id;
		this.protector = protector;
		this.age = age;
		this.num = num;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getProtector() {
		return protector;
	}


	public void setProtector(String protector) {
		this.protector = protector;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	@Override
	public String toString() {
		return "아이디 : " + id + ", 보호자 : " + protector + ", 나이 : " + age + ", 연락처 : " + num;
	}
	

}
