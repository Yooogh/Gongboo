package sample;

import java.awt.List;

public class Test1 extends Object{
	
	public static void main(String[] args) {
		
		//오버로딩 : 하나의 클래스 안에 동일한 메서드 준비. 매개변수에 따라서 결과를 다르게 출력
		System.out.println();
		
		//variable arguments : varage(?)
		System.out.printf(null, args);
		
		//리스코프 치환의 원칙
		List list = new ArrayList();
		list.add("aaa"); //add는 list가 갖고 있음
		//근데 ArrayList 안에 있음
		//실ㅈ ㅔ처리 주체는 ArrayList이므로 AL에 있는 add를 사용하는 것임
		
		
	}

	//오버라이드, 재정의
	@Override
	public String toString() {
		//Object 클래스의 toString(헥사코드 가져옴)
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//을 가져오되 다른 내용을 가짐
		//매개변수를 다르게 넣으면(ex. int a) 어노테이션을 떼지 않겠냐고 물어봄
		return "Test1 []";
	}
	
	

}
