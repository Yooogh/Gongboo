package day02;

public class TypeConversion {

	public static void main(String[] args) {
		int n = 300;
		byte b1 = (byte)n;
		byte b = 127;
		int i = 100;
		System.out.println(b1);
		System.out.println(b+i); //b�� int Ÿ������ �ڵ� ��ȯ
		System.out.println(10/4);
		System.out.println(10.0/4); //4�� 4.0���� �ڵ� ��ȯ
		System.out.println((char)0x12340041); //0x�� ����: 16����
		System.out.println((byte)(b+i)); //��ȯ�ż� -128���� +100
		System.out.println((int)2.9 + 1.8);//2.9�� ���� ĳ����
		System.out.println((int)(2.9 + 1.8));//���� ��� 4.7 ���� ĳ����
		System.out.println((int)2.9 + (int)1.8);//2+1=3
	}
}
