package day05;

class Person {
	private int age;

	public void setAge(int age) {
		this.age = age;
	}
}

class Power{
	private int kick;
	private int punch;
	public void setKick(int kick) {
		this.kick = kick;
	}
	public void setPunch(int punch) {
		this.punch = punch;
	}
	
}
public class Example {

	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.setAge(17);
		//제너레이트로 셋에이지 만들고 매개변수에 17 넣기
		Power robot = new Power();
		robot.kick = 10;
		robot.punch = 20;
	}

}
