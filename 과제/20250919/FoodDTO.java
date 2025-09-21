package Hw;

public class FoodDTO {
	
	int foodnum;
	String foodname;
	int cnt;
	String date;
	
	public FoodDTO(int foodnum, String foodname, int cnt, String date) {
		this.foodnum = foodnum;
		this.foodname = foodname;
		this.cnt = cnt;
		this.date = date;
	}

	public int getFoodnum() {
		return foodnum;
	}

	public void setFoodnum(int foodnum) {
		this.foodnum = foodnum;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "식자재수 : " + foodnum + ", 식자재명 = " + foodname + ", 수량 = " + cnt + ", 등록날짜 = " + date;
	}
	
	
}
