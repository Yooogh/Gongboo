package day05;
class Sample {
	public int a;
	private int b;
	int c;
}

public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; //�ۺ� ���� o
//		aClass.b = 10; //�����̺� ����x �ٸ� Ŭ�����̹Ƿ�
		aClass.c = 10; //����Ʈ ���� o
	}
}
