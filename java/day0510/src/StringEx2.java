
public class StringEx2 {
	public static void main(String args[]) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = new String("AAA");
		
		System.out.println(s1==s2); //같은 내용
		System.out.println(s2==s3); //같은 내용, s3 객체 생성
		System.out.println(s1.equals(s2)); //같은 내용
		System.out.println(s1.equals(s3)); //같은 내용, s3 객체 생성
		/* 스트링 클래스는 new 클래스랑 리터럴값으로 어사인한 거랑 차이가 있음
		 * 상수 값으로 어사인해서 만들어짐,
		 * 새로운 문자열을 만들면 JVM이 상수 풀을 뒤져서 같은 상수가 있으면 그 값을 가져다 씀.
		 */
	}
}
