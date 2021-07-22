package day02;

public class LogicalOperatior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a' > 'b');//유니코드 문자 크기 비교
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		//비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3> 4));
		System.out.println((3 != 2) || (-1 > 0));
		//초서킷. 앞이 거짓이면 뒤를 연산하지 않고 다음 줄로 넘어감. 하나랑 둘이랑 속도의 차이가 남
		System.out.println((3 != 2) | (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}