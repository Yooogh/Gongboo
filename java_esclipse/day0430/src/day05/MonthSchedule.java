package day05;

class Day {
	private String work;
	public void set(String work) {this.work = work;}
	public String get() { return work;}
	public void show() {
		if(work == null)
			System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	
	private int nDays;
	private Day [] days;//Day 타입의 배열
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	public void input() {
		System.out.println("날짜(1~30)?");
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
