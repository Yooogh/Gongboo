package day02;

public class TypeConversion {

	public static void main(String[] args) {
		int n = 300;
		byte b1 = (byte)n;
		byte b = 127;
		int i = 100;
		System.out.println(b1);
		System.out.println(b+i); //b가 int 타입으로 자동 변환
		System.out.println(10/4);
		System.out.println(10.0/4); //4가 4.0으로 자동 변환
		System.out.println((char)0x12340041); //0x로 시작: 16진수
		System.out.println((byte)(b+i)); //순환돼서 -128에서 +100
		System.out.println((int)2.9 + 1.8);//2.9만 정수 캐스팅
		System.out.println((int)(2.9 + 1.8));//연산 결과 4.7 정수 캐스팅
		System.out.println((int)2.9 + (int)1.8);//2+1=3
	}
}
