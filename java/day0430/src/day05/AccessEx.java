package day05;
class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; //퍼블릭 접근 o
//		aClass.b = 10; //프라이빗 접근x 다른 클래스이므로
		aClass.c = 10; //디폴트 접근 o
	}
}
