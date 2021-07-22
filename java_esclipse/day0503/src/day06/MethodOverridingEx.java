package day06;

	class Shape { //슈퍼 클래스
		public Shape next;//링크드리스트 구조. 링크하나하나가 데이터라고 했을때 필드값으로 연결하는 것
		//노드의 값을 읽을 때 그 주소를 알아야 함. 링크드데이터의 경우 데이터와 값이 중복될 수 있고, 순서가 있음.
		//next라는 레퍼런스 값이 가리키는 곳이 다음 노드. 즉 Shape 안에 next가 있고. 그 next를 null로 초기화.
		public Shape() {next = null;}
		
		public void draw() {
			System.out.println("Shape");
		}
	}
	
	class Line extends Shape {
		public void draw() { //메소드 오버라이딩
			System.out.println("Line");
		}
	}
	
	class Rect extends Shape {
		public void draw() { //메소드 오버라이딩
			System.out.println("Rect");
		}
	}
	
	class Circle extends Shape {
		public void draw() { //메소드 오버라이딩
			System.out.println("Circle");
		}
	}
	
	public class MethodOverridingEx {
	static void paint(Shape p) {//Shape를 상속받은 모든 객체들이 매개변수 p로 넘어올 수 있음
		p.draw();//p가 가리키는 객체 내에 오버라이딩된 draw() 호출.
				 //동적 바인딩
	}
		
	public static void main(String[] args) {
		Line line = new Line();//객체 line 생성
		//다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
		paint(line);//print메소드-자기 paint 메소드 안에 있음
		//Line의 draw() 실행, "Line" 출력
		paint(new Shape());//Shape와 
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}

	