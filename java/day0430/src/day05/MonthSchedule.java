package day05;

class Day {
	private String work;
	public void set(String work) {this.work = work;}
	public String get() { return work;}
	public void show() {
		if(work == null)
			System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule {
	
	private int nDays;
	private Day [] days;//Day Ÿ���� �迭
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	public void input() {
		System.out.println("��¥(1~30)?");
	}
	
	public MonthSchedule(int nDays, Day[] days) {
		super();
		this.nDays = nDays;
		this.days = days;
	}

	public static void main(String[] args) {
		
	}
	
	input() {
		
	}
	view() {
		
	}
	finish() {
		
	}
	run() {
		
	}

}
