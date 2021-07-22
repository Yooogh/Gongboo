package day06;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30; //슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; //슈퍼 클래스의 public 멤버 접근 가능
		height = 175; //슈퍼 클래스의 protected 멤버 접근 가능
		//weight = 99; //오류. 슈퍼클래스의 private 접근 불가
		setWeight(99);//private 멤버 weight은 setWeight() 간접 접근
	}
	public void showMember() {
		System.out.println(this.name);
		System.out.println(this.height);
		System.out.println(this.age);
		System.out.println(getWeight());
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.showMember();
	}
}
