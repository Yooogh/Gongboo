package day05;

public class ReferencePassing {

	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	static void increase (Circle m) {
		m.radius++;
	}
}

class Circle { //위에서 pizza가 호출하는 Circle 클래스
	int radius;
	Circle(int radius) { //생성자 만들어 초기화. Circle()에 들어가는 값은 정수 반지름
		this.radius = radius;//Circle(this)의 radius 메소드는 변수 radius로 초기화
	}
}