package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000; // money = money - 1000
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500; // money = money - 1500
	}
	
	public void showInfo() {
		System.out.println(this.studentName + "님의 남은 돈은" + this.money + "입니다.");
	}
}
