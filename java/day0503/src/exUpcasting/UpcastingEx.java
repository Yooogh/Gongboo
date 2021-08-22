package exUpcasting;

class Person {
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
	public void eat(String menu) {
		System.out.println(menu + "를 주문");
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
	public void study(int hour) {
		System.out.println("오늘 공부한 시간은" + hour + "입니다.");
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("이순신");//Student타입을 상속하고 객체를 만듦
		p = s; //업캐스팅 : 부모로부터 접근해서 상속받은 객체까지만 닿을 수 있음
		
		System.out.println(p.name);
//		p.grade = "A"; //p타입은 부모가 물려준 것 까지만 어사인할 수 있기 때문에
//		p.department = "Com"; //상속받은 필드 중에 없음
		s.grade = "A";
		s.department = "Com";//s는 컴파일 오류가 일어나지 않음
//		대개 메소드의 인자로 던질 때 발생
		
		p.eat("봉골레");
		s.study(5);
	}
}
