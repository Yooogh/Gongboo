import java.util.ArrayList;

public class RoundTest {

	public static void main(String[] args) {
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100", 10));
		System.out.println("i="+Integer.parseInt("100", 8));
		System.out.println("i="+Integer.parseInt("100", 2));
		System.out.println("i="+Integer.parseInt("100", 16));
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //객체만 저장가능한 리스트인데
		list.add(new Integer(100));
		list.add(100);
		System.out.println(list);
		
//		Integer i = list.get(0);
//		int i = list.get(0).intValue();
		int i = list.get(0); //컴파일러가 변환해줘서 기본형도 넣을 수 있게 됨.
		System.out.println(list);
		
	}

}
