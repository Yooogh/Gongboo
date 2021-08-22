import java.util.*;
public class VectorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");//들어간 값의 수가 size
		print(v);
		//크기capacity 5짜리 Vector
		
		v.trimToSize();
		System.out.println("***After trimToSize()***");
		print(v);
		//공백 제거
		
		v.ensureCapacity(6);
		System.out.println("***After ensureCapacity***");
		print(v);
		//minCapacity가 되도록
		
		v.setSize(7);
		System.out.println("***After setSize(7)***");
		print(v);
		//size가 7이 되도록. size와 capacity는 다름!
		//capacity 부족하므로 새로운 인스턴스 생성.자동적으로 현재 길이의 2배가 됨.
		
		v.clear();
		System.out.println("***After clear()***");
		print(v);
		//요소 모두 삭제(size 0) capacity 그대로.
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :"+v.size());
		System.out.println("capacity :"+v.capacity());
	}
}
