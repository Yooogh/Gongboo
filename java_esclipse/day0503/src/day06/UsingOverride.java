package day06;
public class UsingOverride {

	public static void main(String[] args) {
		Shape start, last, obj;
		//링크드 리스트로 도형 생성하여 연결
		
		start = new Line(); // Line 객체 연결
		last = start;// ->last가 Line()을 지시함
		
		obj = new Rect();
		last.next = obj; //Rect 객체 연결 ->last.next가 obj를 지
		last = obj;      // ->last도 Rect를 지시
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		obj = new Circle(); //Circle 객체 연결
		last.next = obj;
		//모든 도형 출력
		
		Shape p = start;
		while(p != null) { //'p가 지시하는 객체가 있으면' 이라는 뜻
			p.draw();
			p = p.next;//안에 있는 값이 p.next로 바뀌면
			//p는 변수가 지시하는 쪽으로 한칸씩 이동
			//line-> rect->line-circle의 draw()를 수행
		}
	}

}
