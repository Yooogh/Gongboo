package day04;

public class Animal {
	
	String name;
	int age;
	void eat() {
		System.out.println("eating");
		}
	void speak() {
		System.out.println("speaking");
	}
	void love() {
		System.out.println("love");
	}
	public static void main(String[] args) {
		Plant p1 = new Plant();
		p1.drink();
		//플랜트에서 애니멀 객체를 불러서 수행
		Animal lion = new Animal();
		lion.name = "lion";// .했을 때 뜨는 것 중 나머지는 기본적으로 상속받는 메소드
		lion.age = 4;
		Animal bear = new Animal();
		bear.name = "bear";
		bear.age = 8;
	}
}

class Plant {
	String name;
	int height;
	double weight;
	void drink() {
		Animal a1 = new Animal();
		a1.eat();
	}
}