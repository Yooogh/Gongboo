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
		//���ʷ���Ʈ�� �¿����� ����� �Ű������� 17 �ֱ�
		Power robot = new Power();
		robot.kick = 10;
		robot.punch = 20;
	}

}
