package day0512;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr);//String의 Comparable구현에 의한 정렬
		System.out.println("strArr="+Arrays.toString(strArr));
		//대소문자 포함한 문자 코드 순서에 따라서
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//대소문자 구분X
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());//역순정렬
		System.out.println("strArr="+Arrays.toString(strArr));
	}

}
//역순정렬 구현
class Descending implements Comparator { //Comparator을 구현해야 함!
	public int compare(Object o1, Object o2) {//o1, o2를 비교함
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable한지 확인
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1; //-1을 곱하거나 c2.compareTo(c1)처럼 순서를 바꿔도 됨.
		}//compareto는 자기 자신과 전달받은 객체를 비교함.
		return -1;//if절이 수행되지 않는다 = o1, o2가 Comparable하지 않다는 뜻
	}
	//오름차순일때 ->부호를 바꾸면 내림차순으로 바뀜!
	//또 비교하는 자리를 바꿔도 바뀜! 거꾸로 비교하니까
}