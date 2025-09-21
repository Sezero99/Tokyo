package Hw;

public class HealthDTO {
	
	String name;
	int num;
	int standardcalorie;
	int consumecalorie;
	
	public HealthDTO(String name, int num, int standardcalorie, int consumecalorie) {
		super();
		this.name = name;
		this.num = num;
		this.standardcalorie = standardcalorie;
		this.consumecalorie = consumecalorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getStandardcalorie() {
		return standardcalorie;
	}

	public void setStandardcalorie(int standardcalorie) {
		this.standardcalorie = standardcalorie;
	}

	public int getConsumecalorie() {
		return consumecalorie;
	}

	public void setConsumecalorie(int consumecalorie) {
		this.consumecalorie = consumecalorie;
	}

	@Override
	public String toString() {
		return "회원명 = " + name + ", 회원번호 " + num + ", 기준칼로리 = " + standardcalorie + ", 소비칼로리 = "
				+ consumecalorie;
	}
	
}
